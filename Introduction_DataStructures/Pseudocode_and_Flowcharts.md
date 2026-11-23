# Pseudocode & Flowcharts

---

## PROBLEM PC-1: Prime Number Checker

### Pseudocode

```
ALGORITHM CheckPrime(N)
INPUT:  Positive integer N > 1
OUTPUT: "Prime" or "Not Prime"

BEGIN
    IF N <= 1 THEN
        PRINT "Not Prime"
        STOP
    END IF

    IF N == 2 THEN
        PRINT "Prime"
        STOP
    END IF

    IF N MOD 2 == 0 THEN
        PRINT "Not Prime"
        STOP
    END IF

    SET isPrime = TRUE
    SET i = 3
    WHILE (i * i) <= N DO
        IF N MOD i == 0 THEN
            SET isPrime = FALSE
            BREAK
        END IF
        SET i = i + 2
    END WHILE

    IF isPrime == TRUE THEN
        PRINT "Prime"
    ELSE
        PRINT "Not Prime"
    END IF
END
```

### Trace Examples

| Input | Steps | Output |
|---|---|---|
| N = 61 | Checks i = 3, 5, 7 (7×7=49 ≤ 61, 9×9=81 > 61). None divide 61. | Prime |
| N = 8  | 8 MOD 2 == 0 → early exit | Not Prime |

---

## PROBLEM PC-2: Number Digit Reversal

### Pseudocode

```
ALGORITHM ReverseDigits(N)
INPUT:  Integer N
OUTPUT: Reversed integer

BEGIN
    SET isNegative = FALSE
    IF N < 0 THEN
        SET isNegative = TRUE
        SET N = -N
    END IF

    SET reversed = 0
    WHILE N > 0 DO
        SET lastDigit = N MOD 10
        SET reversed  = (reversed * 10) + lastDigit
        SET N = N DIV 10          // Integer division
    END WHILE

    IF isNegative == TRUE THEN
        SET reversed = -reversed
    END IF

    RETURN reversed
END
```

### Trace Examples

| Input | Steps | Output |
|---|---|---|
| N = 1234 | 4 → 43 → 432 → 4321 | 4321 |
| N = 806  | 6 → 60 → 608 | 608 |

---

## PROBLEM FC-1: Prime Number Flowchart

```
[START]
   |
   v
[Read N]
   |
   v
<Is N == 2?> --Yes--> [Print "Prime"] --> [END]
   | No
   v
<Is N MOD 2 == 0?> --Yes--> [Print "Not Prime"] --> [END]
   | No
   v
[Set i = 3]
   |
   v
<Is (i * i) <= N?> --No--> [Print "Prime"] --> [END]
   | Yes
   v
<Is N MOD i == 0?> --Yes--> [Print "Not Prime"] --> [END]
   | No
   v
[i = i + 2]
   |
   └--(loop back to Is (i * i) <= N?)
```

---

## PROBLEM FC-2: Number Digit Reversal Flowchart

```
[START]
   |
   v
[Read N]
   |
   v
[Set reversed = 0]
   |
   v
<Is N > 0?> --No--> [Print reversed] --> [END]
   | Yes
   v
[lastDigit = N MOD 10]
   |
   v
[reversed = (reversed * 10) + lastDigit]
   |
   v
[N = N DIV 10]
   |
   └--(loop back to Is N > 0?)
```
