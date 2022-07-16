insert into product(product_name,product_price,product_sku)
values('Bread',50,1001);
insert into product(product_name,product_price,product_sku)
values('Tea',30,1002);
insert into product(product_name,product_price,product_sku)
values('Sugar',20,1003);
insert into product(product_name,product_price,product_sku)
values('Salt',15,1004);
insert into product(product_name,product_price,product_sku)
values('Milk',10,1005);




DROP TABLE IF EXISTS basketitem;
  
CREATE TABLE basketitem (
  line_item_Id INT AUTO_INCREMENT  PRIMARY KEY,
  basketid INT  NOT NULL,
  product_sku INT NOT NULL,
  product_quantity INT NOT NULL,
  FOREIGN KEY (product_sku) REFERENCES product(product_sku)
);

insert into basketitem(basketid,product_sku,product_quantity)
values(1,1001,2);
insert into basketitem(basketid,product_sku,product_quantity)
values(1,1002,1);
insert into basketitem(basketid,product_sku,product_quantity)
values(1,1003,1);
insert into basketitem(basketid,product_sku,product_quantity)
values(1,1004,5);
insert into basketitem(basketid,product_sku,product_quantity)
values(1,1005,1);

insert into basketitem(basketid,product_sku,product_quantity)
values(2,1001,4);
insert into basketitem(basketid,product_sku,product_quantity)
values(2,1002,3);
insert into basketitem(basketid,product_sku,product_quantity)
values(2,1003,2);
insert into basketitem(basketid,product_sku,product_quantity)
values(2,1004,6);
insert into basketitem(basketid,product_sku,product_quantity)
values(2,1005,3);



DROP TABLE IF EXISTS offer;
  
CREATE TABLE offer (
  offer_Id INT AUTO_INCREMENT  PRIMARY KEY,
  product_sku INT NOT NULL,
  offer_quantity INT NOT NULL,
  offer_price INT
);

insert into offer(product_sku,offer_quantity,offer_price)
values(1001,3,130);
insert into offer(product_sku,offer_quantity,offer_price)
values(1002,2,55);
insert into offer(product_sku,offer_quantity,offer_price)
values(1003,4,70);
insert into offer(product_sku,offer_quantity,offer_price)
values(1004,5,65);



DROP TABLE IF EXISTS Promotiontype;
  
CREATE TABLE Promotiontype (
  promo_type_id INT AUTO_INCREMENT  PRIMARY KEY,
  promo_name VARCHAR(50) NOT NULL,
  promo_value INT NOT NULL
);

insert into Promotiontype(promo_name,promo_value)
values('Percentage',20);
insert into Promotiontype(promo_name,promo_value)
values('ValueOff',30);



DROP TABLE IF EXISTS Promotion;
  
CREATE TABLE Promotion (
  promo_id INT AUTO_INCREMENT  PRIMARY KEY,
  promo_Code VARCHAR(250) NOT NULL,
  promo_Type_Id LONG NOT NULL,
  FOREIGN KEY (promo_Type_Id) REFERENCES PromotionType(promo_type_id)
);

insert into Promotion(promo_Code,promo_Type_Id)
values('20PerOff',1);
insert into Promotion(promo_Code,promo_Type_Id)
values('20ValueOff',2);