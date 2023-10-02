import java.util.LinkedList;

/**
 * A basic implementation of {@link IStack} that wraps around a {@link LinkedList}.
 *
 * @since 2 October 2023
 * @author Julian Edwards
 *
 */
public class myStack implements IStack
{
    // used to internally store the values of this stack
    protected final LinkedList<Character> charList = new LinkedList<>();

    /**
     * Pushes a character onto the stack.
     * @param c the character to push.
     *
     * @since 2 October 2023
     * @author Julian Edwards
     */
    @Override
    public void push(final Character c) { charList.push(c); }

    /**
     * Pops the top character from the stack.
     * @return the character popped.
     *
     * @since 2 October 2023
     * @author Julian Edwards
     */
    @Override
    public Character pop() { return charList.pop(); }

    /**
     * Same as {@link myStack#pop()}, but does not remove the element from the stack.
     * @return the character peeked.
     *
     * @since 2 October 2023
     * @author Julian Edwards
     */
    @Override
    public Character peek() { return charList.peek(); }

    /**
     * @return true if the stack contains no characters.
     *
     * @since 2 October 2023
     * @author Julian Edwards
     */
    @Override
    public boolean isEmpty() { return charList.isEmpty(); }
}
