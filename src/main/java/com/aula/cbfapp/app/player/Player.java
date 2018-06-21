package com.aula.cbfapp.app.player;

    public class Player {

        private int id;
        private String fullName;
        private String nickName;
        private int age;
        private String wikiPage;
        private String club;
        private int squadNumber;

        public Player(int id, String fullName, String nickName, int age, String wikiPage, String club, int squadNumber) {
            this.id = id;
            this.fullName = fullName;
            this.nickName = nickName;
            this.age = age;
            this.wikiPage = wikiPage;
            this.club = club;
            this.squadNumber = squadNumber;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getWikiPage() {
            return wikiPage;
        }

        public void setWikiPage(String wikiPage) {
            this.wikiPage = wikiPage;
        }

        public String getClub() {
            return club;
        }

        public void setClub(String club) {
            this.club = club;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public int getSquadNumber() {
            return squadNumber;
        }

        public void setSquadNumber(int squadNumber) {
            this.squadNumber = squadNumber;
        }
    }
