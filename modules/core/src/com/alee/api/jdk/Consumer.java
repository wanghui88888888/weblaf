/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.api.jdk;

/**
 * Represents an operation that accepts a single input argument and returns no result.
 * Unlike most other functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * This is a custom consumer for JDK6 support.
 *
 * @param <T> the type of the input to the operation
 * @author Mikle Garin
 */
public interface Consumer<T>
{
    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    public void accept ( T t );
}