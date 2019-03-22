This is simple library for message logging:

The library should have the following components:
	 Layouts - define the format in which messages should be appended (e.g. SimpleLayout displays logs in the
format &quot;&lt;date-time&gt; - &lt;report level&gt; - &lt;message&gt;&quot;)
	 Appenders - responsible for appending the messages somewhere (e.g. Console, File, etc.)
	 Loggers - hold methods for various kinds of logging (warnings, errors, info, etc.)
Whenever a logger is told to log something, it calls all of its appenders and tells them to append the message. In
turn, the appenders append the message (e.g. to the console or a file) according to the layout they have.