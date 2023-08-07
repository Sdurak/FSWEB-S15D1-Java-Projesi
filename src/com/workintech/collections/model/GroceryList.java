package com.workintech.collections.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> groceryList = new ArrayList<>();

            while (true) {
                System.out.println("0: Çıkış");
                System.out.println("1: Eleman Ekle");
                System.out.println("2: Eleman Çıkar");
                System.out.print("Seçiminizi yapın: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 0:
                        System.out.println("Uygulama sonlandırılıyor.");
                        return;
                    case 1:
                        System.out.print("Eklemek istediğiniz elemanları girin (virgülle ayırarak): ");
                        String addInput = scanner.nextLine();
                        addItems(groceryList, addInput);
                        break;
                    case 2:
                        System.out.print("Çıkarmak istediğiniz elemanları girin (virgülle ayırarak): ");
                        String removeInput = scanner.nextLine();
                        removeItems(groceryList, removeInput);
                        break;
                    default:
                        System.out.println("Geçersiz seçim. Tekrar deneyin.");
                        break;
                }

                printSorted(groceryList);
            }
        }

        //metotlar
        public static void addItems(ArrayList<String> list, String input) {
            String[] itemsToAdd = input.split(", ");
            for (String item : itemsToAdd) {
                if (!item.isEmpty()) {
                    if (!checkItemIsInList(list, item)) {
                        list.add(item);
                    } else {
                        System.out.println(item + " zaten listede bulunuyor.");
                    }
                }
            }
            Collections.sort(list);
        }

        public static void removeItems(ArrayList<String> list, String input) {
            String[] itemsToRemove = input.split(", ");
            for (String item : itemsToRemove) {
                if (!item.isEmpty()) {
                    if (checkItemIsInList(list, item)) {
                        list.remove(item);
                    } else {
                        System.out.println(item + " listede bulunmuyor.");
                    }
                }
            }
            Collections.sort(list);
        }

        public static boolean checkItemIsInList(ArrayList<String> list, String item) {
            return list.contains(item);
        }

        public static void printSorted(ArrayList<String> list) {
            System.out.println("Liste:");
            for (String item : list) {
                System.out.println(item);
            }
        }
    }

