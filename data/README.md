
# Data Files
## File name : placement.csv

Description:

The CSV file named placement.csv contains information about the products placement within a store. The file contains over 300 coordinates.

Fields : 

- product_id: A unique identifier for each product.
- x: The x-coordinate of the product's location in the store.
- y: The y-coordinate of the product's location in the store.

Legend :

- Products are displayed with prefix "P" (e.g. P99)
- Cashier desks are displayed with prefix "CA" (e.g. CA1)
- Self checkout, "S" (e.g. S1)
- Blocked areas, "BL" - movement in these fields is impossible and prohibited. These are service or other areas that the customer cannot visit.
- EN, the xy coordinate that marks the store entrance. All customers start from here.
- EX, the xy coordinate that marks the store exit. All customers end their shopping journey here.

## File name : product_master_data.csv

Description:

The CSV file named product_master_data.csv contains information regarding the product master data for over 300 products, 
including various types of vegetables, fruits, and other items. 

Fields : 

- product_id: A unique identifier for each product.
- product_category: Product category (e.g. Месо)
- product_name: A unique name for each product (e.g. Телешко месо)
