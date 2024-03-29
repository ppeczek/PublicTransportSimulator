/*
 * Copyright (C) 2014 Maciej Majewski
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package orderexample;

import order.OrderPrioritableAbstract;

/** Odrobinkę bardziej złożona implementacja rozkazu.
 * @author Maciej Majewski
 */
public class ExampleOrder_WithArgument extends OrderPrioritableAbstract<ExampleFunctionality>{
    private String msg;

    public ExampleOrder_WithArgument(String msg) {
        this.msg = msg;
    }

    @Override
    public void execute(ExampleFunctionality subject) {
        subject.printTxt(msg);
    }
    
}
