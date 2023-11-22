package com.pluralsight;

public class Pokemon extends Card implements PlayableInterface {
   private String pokemonName, elementType, energyType;

   private int energyCost, attackPower;

    public Pokemon(int cardNumber, String material, String color, boolean holographic, boolean reverseHolographic, boolean artCard, String pokemonName, String elementType, String energyType, int energyCost, int attackPower) {
        super(cardNumber, 2.5, 3.5, material, color, holographic, reverseHolographic, artCard);
        this.pokemonName = pokemonName;
        this.elementType = elementType;
        this.energyType = energyType;
        this.energyCost = energyCost;
        this.attackPower = attackPower;
    }

    public void attack(String attackType, int attackPower) {
       System.out.printf("Pokemon used %s and did %d damage", attackType, attackPower);
   }

   public void evolve() {
       //Upgrade pokemon evolution
   }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public void play() {
        System.out.println("Playing Pokemon");
    }

    @Override
    public double evaluatePrice() {
        return 10.0;
    }
}
