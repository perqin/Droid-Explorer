package com.droid.explorer.command.shell.impl

import com.droid.explorer.command.shell.ShellCommand

/**
 * Created by Jonathan on 4/23/2016.
 */
class ListFiles(val directory: String) : ShellCommand() {

	override val shellArgs = arrayOf("ls", directory)

}