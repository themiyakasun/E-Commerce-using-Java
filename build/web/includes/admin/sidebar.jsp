        <aside class="sidebar-wrapper" data-simplebar="true">
          <div class="sidebar-header">
            <div>
              <img src="../assets/logo.png" class="logo-icon" alt="logo icon">
            </div>
            <div class="toggle-icon ms-auto"><i class="bi bi-chevron-double-left"></i>
            </div>
          </div>

              <ul class="metismenu" id="menu">
                <li>  
                    <a onclick="loadContent('../includes/admin/products.jsp', this)" class="process-element" id="side-link">
                        <div class="parent-icon"><i class="bi bi-bag-check"></i>
                        </div>
                        <div class="menu-title">Product List</div>
                    </a>
                </li>
                <li>  
                    <a onclick="loadContent('../includes/admin/categories.jsp', this)" class="process-element" id="side-link">
                        <div class="parent-icon"><i class="bi bi-bag-check"></i>
                        </div>
                        <div class="menu-title">Categories</div>
                    </a>
                </li>
                <li>  
                    <a onclick="loadContent('../includes/admin/orders.jsp', this)" class="process-element" id="side-link">
                        <div class="parent-icon"><i class="bi bi-bag-check"></i>
                        </div>
                        <div class="menu-title">Orders</div>
                    </a>
                </li>
                <li>  
                    <a onclick="loadContent('../includes/admin/addNewProduct.jsp', this)" class="process-element add-new-product" id="side-link ">
                        <div class="parent-icon"><i class="bi bi-bag-check"></i>
                        </div>
                        <div class="menu-title">Add New Product</div>
                    </a>
                </li>
              </ul>
  
       </aside>