package fr.cnam.tp12.mypatterns;

public interface MyObservable {
    /**
     * Adds an observer to the internal list of observers.
     *
     * @param observer: The Object that will observe this Observable
     */
    void addObserver(MyObserver observer);

    /**
     * @param observer: Deletes an observer from the internal list of observers.
     */
    void deleteObserver(MyObserver observer);

    /**
     * @return: number of observers in the internal list of observers.
     */
    int countObservers();


    /**
     *  Checks the internal flag to see if the observable has changed state and notifies all observers.
     *  Passes the object specified in the parameter list to the notify() method of the observer.
     */

    void notifyObservers();



    /**
     * Deletes all observers from the internal list of observers.
     */
    //    void deleteObservers();



    /**
     * Sets the internal flag that indicates this observable has changed state.
     */
    //void setChanged();

    /**
     * Clears the internal flag that indicates this observable has changed state.
     */
    //void clearChanged();

    /**
     * @return: true if this observable has changed state else false
     */
    //boolean hasChanged();



    /**
     * @param obj: Checks the internal flag to see if the observable has changed state and notifies all observers.
     *             Passes the object specified in the parameter list to the notify() method of the observer.
     */

     //void notifyObservers(Object obj);

}
