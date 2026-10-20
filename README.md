# TimePat

A simple Java application featuring a countdown timer and a stopwatch.

## Features

- Timer (TimePat)
- Stopwatch (PatWatch)

## What It Does

Time units are included:

- Milliseconds
- Seconds
- Minutes
- Hours

TimePat and PatWatch will simulate conventional timer and stopwatch functionality:

- Seconds roll over at 60 into minutes.
- Minutes roll over at 60 into hours.
- Hours have no upper limit.

> [!NOTE]
> The program will target 60 FPS for display updates. Time will be measured independently using elapsed time, while the displayed timer will refresh at approximately 60 updates per second. The actual refresh rate may vary depending on system performance.

### TimePat

Given a duration in hours, minutes, seconds, and milliseconds, TimePat counts down to zero, updating each time unit as the countdown progresses.

### PatWatch

PatWatch measures the elapsed time from when the stopwatch is started, displaying the elapsed hours, minutes, seconds, and milliseconds in conventional time format.

## Prerequisites

- Java 17+
