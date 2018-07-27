package org.codefx.demo.junit5.extensions;

import org.codefx.demo.junit5.DisabledOnOs;
import org.codefx.demo.junit5.OS;
import org.codefx.demo.junit5.TestExceptOnOs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DisabledOnOsTest {

	@Test
	void runsOnAllOS() {
		assertTrue(true);
	}

	@Test
	@DisabledOnOs(OS.NIX)
	void doesNotRunOnLinux_fails() {
		assertTrue(false);
	}

	@Test
	@DisabledOnOs(OS.WINDOWS)
	void doesNotRunOnWindows_fails() {
		assertTrue(false);
	}

	@TestExceptOnOs(OS.NIX)
	void doesNotRunOnLinuxEither_fails() {
		assertTrue(false);
	}

	@TestExceptOnOs(OS.WINDOWS)
	void doesNotRunOnWindowsEither_fails() {
		assertTrue(false);
	}

}
