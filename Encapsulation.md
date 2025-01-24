# Encapsulation
The meaning of **encapsulation** is to make sure that sensitive data is hidden from users. To achieve this, you must:
    - Declare class variables/attributes as `private`.
    - Provide public **get** and **set** methods to access and update the value of a `private` variable.

## Get and Set
`private` variables can only be accessed within the same class. It is possible to access them if we provide public **get** and **set** methods.

The `get` method returns the variable value, the `set` method sets the value.

## Why Encapsulation?
- Better control of class attributes and methods.
- Class attributes can be made read-only (`get`) or write-only (`set`).
- Flexible: the programmer can change one part of the code without affecting other parts.
- Increased data security.