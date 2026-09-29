class Bike
{
    private int gear;

    public void setGear(int gear) throws IllegalArgumentException
    {
        if(gear > 5 || gear == 0)
        {
            throw new IllegalArgumentException(
                "Please enter the gear between (1-5), not zero"
            );
        }

        this.gear = gear;
    }

    public int getGear()
    {
        return gear;
    }
}