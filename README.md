# SI_2024_lab2_223237
## Мила Саватиќ 223237
### Control Flow Graph
![CFG drawio](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/7301d3db-cde0-4184-ada7-b219d3915594)
![image](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/126bfc72-635f-4ec2-9dfb-a4e7615aa90b)
![image](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/ccc37f2f-bf0e-4259-80ef-911c6a456533)
### Цикломатска комплексност
Користејќи ја формулата за цикломатска комплексност: V(G) = E - N + 2. Каде што во мојот граф за E има 34 edges, за N 26 nodes. Ако замениме во формулата V(G) = 34 - 26 + 2, V(G) = 10, цикломатската комплексност на кодот е 10. Исто така по региони, на графот има 10 региони. 
### Тест случаи според Every Branch критериумот
![Screenshot 2024-05-25 214837](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/4e9367f2-8596-4af2-86b1-b6a9074038b2)
![image](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/74b239ef-f46f-45c0-b1f6-53a4d3e24855)
### Тест случаи според Multiple Condition критериумот за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')
![Screenshot 2024-05-25 221632](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/483dd931-ee5c-45f1-886e-050108c7678c)
![TFX](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/74ee2fb4-eed8-4a29-af8d-35849d31bbbc)
![image](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/0b508b34-36c2-4e98-b35b-8fd7c3abc7e1)
![image](https://github.com/milasavatic/SI_2024_lab2_223237/assets/164552422/4e50e553-4be1-47d1-a85b-f65d2cbf93bd)
### Објаснување за Unit Tests
Целта на Unit тестовите е да се исполнат сите услови и да поминат сите exceptions. Со употреба на assertThrows се фаќаат exceptions, a за да се провери дали се фрлил соодветниот exception се користи assertTrue. Се употребува и assertEquals за да се провери дали програмата го враќа точниот резултат.
Со Multiple Condition се проверуваат сите if услови каде што има повеќе од еден услов, во нашиот случај if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'). И овде се користи assertThrows и assertTrue за фаќање и проверување дали е точен даден exception и assertEquals за проверување дали програмата враќа точен резултат.
