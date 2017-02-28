# Deterministic Finite Automaton Converter

![Alt text](https://github.com/jordanott/Deterministic-Finite-Automaton-Converter/blob/master/nfa_to_dfa.jpg "DFA Converter")

Takes the specification for a Non-Deterministic Finite Automata (NFA) as input and outputs the specification for an equivalent Deterministic Finite Automata (DFA).The NFA input specification will be passed as a command line argument and be of the following form:
   * Line 1: A list of states, Q, separated by tabs.
   * Line 2: A list of symbols Σ, separated by tabs. The string E will not be explicitly included.
   * Line 3: The start state, q<sub>0</sub> ∈ Q.
   * Line 4: The set of accept states, F, separated by tabs.
   * Line 5: The transition function. Each line will be of the form s, x = s<sup>f</sup>. This is translated to mean that reading symbol x in the state s causes a transition to state s<sup>f</sup>. The string EPS will be used to represent an epsilon transition.

The output is to a text file with the extension .DFA. The output contains the same format as above. Em represents the empty state, ∅. If {1} and {2} are states in the NFA that are combined in the DFA, represent the state with the string {1,2}.
  
