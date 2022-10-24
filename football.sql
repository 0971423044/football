-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: employeemybbatis
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cart_item`
--

DROP TABLE IF EXISTS `cart_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart_item` (
  `cartid` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL,
  `productid` int NOT NULL,
  `quantity` int NOT NULL,
  `createAt` datetime NOT NULL,
  `total` float NOT NULL,
  PRIMARY KEY (`cartid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart_item`
--

LOCK TABLES `cart_item` WRITE;
/*!40000 ALTER TABLE `cart_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id_category` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_category`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Clothes','quan ao mac cua doi bong'),(2,'Glasses','kinh deo mat'),(3,'Socks','tat deo thi dau'),(4,'Cap','mu luoi trai nang dong'),(5,'Ball','bong thi dau chuan quoc te'),(6,'Backpack','balo dung do ca nhan');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'Home',NULL),(2,'Product',NULL),(3,'Service',NULL),(4,'Contact',NULL),(5,'About',NULL),(6,'Cart',NULL);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `mahd` int NOT NULL,
  `makh` int NOT NULL,
  `createAt` datetime NOT NULL,
  `total` float NOT NULL,
  PRIMARY KEY (`mahd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_detail` (
  `mahd` int NOT NULL,
  `productid` int NOT NULL,
  `Soluong` float NOT NULL,
  `Dongia` float NOT NULL,
  `Thanhtien` float NOT NULL,
  `Giamgia` float DEFAULT NULL,
  PRIMARY KEY (`mahd`,`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `productname` varchar(200) NOT NULL,
  `price` double NOT NULL,
  `quantity` int NOT NULL,
  `status` tinyint(1) NOT NULL,
  `id_category` int NOT NULL,
  `title` varchar(200) DEFAULT NULL,
  `highlight` tinyint DEFAULT NULL,
  `product_new` tinyint DEFAULT NULL,
  `detail` longtext,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `size` varchar(10) DEFAULT NULL,
  `sale` int DEFAULT NULL,
  `thumbnail` tinyint DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `fk_category_id_idx` (`id_category`),
  CONSTRAINT `fk_category_id` FOREIGN KEY (`id_category`) REFERENCES `category` (`id_category`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Tee Shirt Homekit',2000,10,1,1,'The best homekit arsenal ever',1,0,'<div class=\\\"tab-pane fade active in\\\" id=\\\"home\\\">\\r\\n			  <h4>Product Information</h4>\\r\\n                <table class=\\\"table table-striped\\\">\\r\\n				<tbody>\\r\\n				<tr class=\\\"techSpecRow\\\"><td class=\\\"techSpecTD1\\\">Color:</td><td class=\\\"techSpecTD2\\\">Black</td></tr>\\r\\n				<tr class=\\\"techSpecRow\\\"><td class=\\\"techSpecTD1\\\">Style:</td><td class=\\\"techSpecTD2\\\">Apparel,Sports</td></tr>\\r\\n				<tr class=\\\"techSpecRow\\\"><td class=\\\"techSpecTD1\\\">Season:</td><td class=\\\"techSpecTD2\\\">spring/summer</td></tr>\\r\\n				<tr class=\\\"techSpecRow\\\"><td class=\\\"techSpecTD1\\\">Usage:</td><td class=\\\"techSpecTD2\\\">fitness</td></tr>\\r\\n				<tr class=\\\"techSpecRow\\\"><td class=\\\"techSpecTD1\\\">Sport:</td><td class=\\\"techSpecTD2\\\">122855031</td></tr>\\r\\n				<tr class=\\\"techSpecRow\\\"><td class=\\\"techSpecTD1\\\">Brand:</td><td class=\\\"techSpecTD2\\\">Shock Absorber</td></tr>\\r\\n				</tbody>\\r\\n				</table>\\r\\n				\n<p>Raw denim you probably haven\\\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\\r\\n				<p>Raw denim you probably haven\\\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\\r\\n				<p>Raw denim you probably haven\\\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\\r\\n				<p>Raw denim you probably haven\\\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\\r\\n				<p>Raw denim you probably haven\\\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\\r\\n				\n<p>Raw denim you probably haven\\\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\\r\\n				<p>Raw denim you probably haven\\\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\\r\\n				<p>Raw denim you probably haven\\\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\\r\\n\\r\\n</div>','2022-04-09 11:38:04','2022-04-09 11:47:31','S,M,L',0,NULL),(2,'Tee Shirt Awaykit',1500,5,1,1,'The best tee shirt awaykit',1,0,'Very comfortable','2022-10-10 09:11:05','2022-10-10 09:11:05','S,M,L',0,NULL),(3,'Sun glasses black',5000,12,1,2,'The best sun glasses',1,0,'Vere comfortable',NULL,NULL,NULL,0,NULL),(4,'Case glasses',5200,22,1,2,'The case glasses',1,0,'Very comfortable',NULL,NULL,NULL,0,NULL),(5,'Arsenal Cap Violet',500,10,1,1,'The best cap arsne',1,0,'Very comfortable','2022-10-19 00:00:00','2022-10-20 00:00:00','S,M,L',0,NULL),(6,'Awaykit black',4000,100,1,1,'The best awaykit arsenal ever',1,0,'Very comfortable','2022-10-12 15:03:12','2022-10-13 00:00:00','S,M,L',50,NULL),(7,'Awaylit green black',4500,50,1,1,'The best third awaykit arsenal ever',1,0,'Vere comfortable','2022-10-12 15:04:12',NULL,'S,M,L',50,NULL),(8,'Three holes shirt',6000,24,1,1,'The best three holes shirt',1,0,'Very comfortable',NULL,NULL,'S,M,L',50,NULL),(9,'Awaykit stripe',6500,32,1,1,'The best awaykit stripe color ever',1,0,'Very comfortable',NULL,NULL,'S,M,L',0,NULL),(10,'Awaykit 2021',7000,44,1,1,'The awaykit navy arsenal ever',1,0,'Very comfortable',NULL,NULL,'S,M,L',0,NULL),(11,'Pants sport',2500,12,1,1,'The best pants sport arsenal ever',1,0,'Very comfortable',NULL,NULL,'S,M,L',0,NULL),(12,'Tee shirt training',1350,30,1,1,'The best tee shirt training ever',1,0,'Very comfortable',NULL,NULL,'S,M,L',0,NULL),(13,'Long socks yellow',300,100,1,3,'The best long arsenal ever',0,1,'Very comfortable',NULL,NULL,'S,M,L',0,NULL),(14,'Long socks red',300,100,1,3,'The best long socks arsenal ever',0,1,'Very comfortable',NULL,NULL,NULL,0,NULL),(15,'Long socks pink',300,100,1,3,'The best long socks arsenal ever',0,1,'Very comfortable',NULL,NULL,NULL,0,NULL),(16,'Long socks denim',300,100,1,3,'The best long socks arsenal ever',0,1,'Very comfortable',NULL,NULL,NULL,0,NULL),(17,'Ball fifa world cup',100,100,1,5,'The best ball in the world',0,1,'So beautiful',NULL,NULL,'S,M,L',0,NULL),(18,'Ball dual tone red white',100,100,1,5,'The best ball in the world',0,1,'So beautiful',NULL,NULL,'S,M,L',0,NULL),(19,'Ball stripe color',100,1,1,5,'The best ball in the world',0,1,'So beautiful',NULL,NULL,'S,M,L',0,NULL),(20,'Ball superman',100,1,1,5,'The best ball in the world',0,1,'So beautiful',NULL,NULL,'S,M,L',0,NULL),(21,'Glasses sun black',500,1,1,2,'The best glasses sun in the world',0,0,'So cool',NULL,NULL,NULL,0,NULL),(22,'Glasses sun heart shape',450,2,1,2,'The best glasses in the world',0,0,'So cool',NULL,NULL,NULL,0,NULL),(23,'Glasses case ',300,5,1,2,'The glasses case in the world',0,0,'So cool',NULL,NULL,NULL,0,NULL),(24,'Cap arsenal maron',70,100,1,4,'The best cap arsenal ever',0,0,'So cool',NULL,NULL,NULL,0,NULL),(25,'Cap arsenal red ',50,50,1,4,'The best cap arsenal ever',0,0,'So cool ',NULL,NULL,NULL,0,NULL),(26,'Cap arsenal white gray',30,30,1,4,'The best cap arsenal ever',0,0,'So cool',NULL,NULL,NULL,0,NULL),(27,'Cap arsenal red small ',25,25,1,4,'The best cap arsenal ever',0,0,'So cool',NULL,NULL,NULL,0,NULL),(28,'Cap arsenal white sport ',80,80,1,4,'The best cap arsenal ever',0,0,'So cool',NULL,NULL,NULL,0,NULL),(29,'Backpack arsenal ',120,50,1,6,'The best backpack arsenal ever',1,0,'Extremely useful',NULL,NULL,NULL,0,NULL),(30,'Backpack arsenal',150,50,1,6,'The best backpack',0,1,'Extremely useful',NULL,NULL,NULL,0,NULL),(31,'Backpack arsenal',180,50,1,6,'The best backpack arsenal ever',1,0,'Extremely useful',NULL,NULL,NULL,0,NULL),(32,'Backpack arsenal',210,50,1,6,'The best backpack arsenal ever',0,1,'Extremely useful',NULL,NULL,NULL,0,NULL),(33,'Backpack arsenal',240,30,1,6,'The best backpack arsenal ever',1,0,'Extremely useful',NULL,NULL,NULL,0,NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_color`
--

DROP TABLE IF EXISTS `product_color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_color` (
  `id_color` int NOT NULL AUTO_INCREMENT,
  `product_id` int NOT NULL,
  `name_color` varchar(200) NOT NULL,
  `code` varchar(200) NOT NULL,
  `img` varchar(200) NOT NULL,
  PRIMARY KEY (`id_color`),
  KEY `fk_product_id_idx` (`product_id`),
  CONSTRAINT `fk_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_color`
--

LOCK TABLES `product_color` WRITE;
/*!40000 ALTER TABLE `product_color` DISABLE KEYS */;
INSERT INTO `product_color` VALUES (1,1,'Yellow','#FFFF00','clothes-5.jpg'),(2,1,'Red','#DC143C	','clothes-2.jpg'),(3,3,'Yellow','#FFFF00','glasses-sun-1.jpg'),(4,5,'Pink','#FFCCFF','clothes-1.jpg'),(5,6,'Navy','#000080','clothes-10.jpg'),(6,7,'Black','#000000','clothes-6.jpg'),(7,8,'Aqua','#33CCFF','clothes-8.jpg'),(8,9,'Lime','#00FF00	','clothes-7.jpg'),(9,10,'Maron','#800000','clothes-25.jpg'),(10,11,'Plum','#660033','clothes-21.jpg'),(11,12,'Yellow stripe','#FFFF66','clothes-26.jpg'),(12,13,'Yellow','#FFFF00','socks-1.jpg'),(13,14,'Red','#DC143C','socks-2.jpg'),(14,15,'Pink','#FFCCFF','socks-3.jpg'),(15,16,'Navy','#000080','socks-4.jpg'),(16,17,'Red','#DC143C','ball-1.jpg'),(17,18,'Red','#DC143C','ball-2.jpg'),(18,19,'Red','#DC143C','ball-3.jpg'),(19,20,'Navy','#000080','ball-4.jpg'),(20,21,'Black','#000000','glasses-sun-1.jpg'),(21,22,'Black','#000000','glasses-sun-2.jpg'),(22,23,'White','#FFFFFF','glasses-case-3.jpg'),(23,24,'Maron','#800000','cap-1.jpg'),(24,25,'Red','#DC143C','cap-2.jpg'),(25,26,'Gray','#808080','cap-3.jpg'),(26,27,'Plum','#660033','cap-4.jpg'),(27,28,'White','#FFFFFF','cap-5.jpg'),(33,29,'Black','#000000','backpack-1.jpg'),(34,30,'Red','#DC143C','backpack-2.jpg'),(35,31,'Navy','#000080','backpack-3.jpg'),(36,32,'Red','#DC143C','backpack-4.jpg'),(38,33,'Dark blue','#00008B','backpack-7.jpg');
/*!40000 ALTER TABLE `product_color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Admin','Do anything'),(2,'User','Access to homepage');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `slide`
--

DROP TABLE IF EXISTS `slide`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `slide` (
  `id` int NOT NULL AUTO_INCREMENT,
  `img` varchar(100) NOT NULL,
  `caption` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `slide`
--

LOCK TABLES `slide` WRITE;
/*!40000 ALTER TABLE `slide` DISABLE KEYS */;
INSERT INTO `slide` VALUES (1,'slide-1.jpg','Best celabrate','The arsenal guys are celebrating together'),(2,'slide-2.jpg','Best team ever','All of team take a photo'),(3,'slide-3.jpg','So cool','Arsenal players take a photo in house'),(4,'slide-4.png','Stadium at night','Emires stadium at night so beatiful'),(5,'slide-5.png','Dressing room','Dressing room premium extremely solemn');
/*!40000 ALTER TABLE `slide` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `address` varchar(200) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `password` varchar(200) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'xuan xhaka','xhaka@gmail.com','nam','bac ninh','0971423044','123',1),(2,'hiep cadrick','cadrick@gmail.com','nam','thai binh','0987654324','456',1),(3,'khanh isco','isco@gmail.com','nam','dong ky','0124871412','789',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_role` (
  `user_id` int NOT NULL,
  `role_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'employeemybbatis'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-24 11:37:41
