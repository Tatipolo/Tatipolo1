package com.company;

public class Bankomat implements BankomatImpl {
    private Card[] _cards;
    private Card _userCard;

    public Bankomat() {
        // Создаем базу данных карточек.
        this._cards = new Card[]{
          new Card("1234567", "1234", 120.9f),
          new Card("3452541", "7895", 0),
          new Card("2233558", "4897" , 100),
        };
    }

    public boolean checkPing(String cardID, String pin){
        int i = 0;
        for (; i < this._cards.length; i++){
            if (this._cards[i].ID.equals(cardID)){
                this._userCard = this._cards[i];
                break;
            }
        }
        // ! инвентирует логическое значение, читается как "НЕ"
        // null нулевой указатель ноль для объектов
        if (this._userCard == null){
            System.out.println("Неверный ID карточки");
            return false;
        }
        //проверяем пин код
         return this._cards[i].PIN.equals(pin);
    }

    public float getBalance (){
        return this._userCard.money;
    }

    public void getCash(float cash){
        if (cash > this._userCard.money){
            System.out.println("недостаточно средств");
        }
        else {
            // -= отнимает и перезаписывает
            this._userCard.money -= cash;
        }
    }

    public void addCash (float cash){
        this._userCard.money += cash;
    }

    public void reject (){
        this._userCard = null;
    }

    class Card{
        String ID;
        String PIN;
        float money;

        public Card (String id, String pin, float money) {
            this.ID = id;
            this.PIN = pin;
            this.money = money;

        }
    }
}
