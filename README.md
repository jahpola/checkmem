# checkmem

A simple Java tool that displays JVM memory usage information including heap, non-heap, and configured limits.

## Requirements

- Java 21+ 
- Docker (optional)

## Usage

### Run directly

```sh
java Check.java
```

### Run with Docker

```sh
docker build -t checkmem .
docker run checkmem
```

### Example output

```
heap: init = 268435456(262144K) used = 1048576(1024K) committed = 268435456(262144K) max = 4294967296(4194304K)
non-heap: init = 7667712(7488K) used = 3563208(3479K) committed = 8126464(7936K) max = -1(-1K)
Initial Memory (xms): 256 MB
Max memory (xmx): 4096 MB
```

You can configure JVM memory with standard flags:

```sh
java -Xms128m -Xmx512m Check.java
```

