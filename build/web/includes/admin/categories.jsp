              <div class="card">
                <div class="card-header py-3">
                  <h6 class="mb-0">Add Product Category</h6>
                </div>
                <div class="card-body">
                   <div class="row">
                     <div class="col-12 col-lg-4 d-flex">
                       <div class="card border shadow-none w-100">
                         <div class="card-body">
                           <form class="row g-3">
                             <div class="col-12">
                               <label class="form-label">Name</label>
                               <input type="text" class="form-control" placeholder="Category name">
                             </div>
                             <div class="col-12">
                              <label class="form-label">Slug</label>
                              <input type="text" class="form-control" placeholder="Slug name">
                            </div>
                            <div class="col-12">
                              <label class="form-label">Parent</label>
                              <select class="form-select">
                                <option>Fashion</option>
                                <option>Electronics</option>
                                <option>Furniture</option>
                                <option>Sports</option>
                              </select> 
                            </div>
                            <div class="col-12">
                              <div class="d-grid">
                                <button class="btn btn-primary">Add Category</button>
                              </div>
                            </div>
                           </form>
                         </div>
                       </div>
                     </div>
                     <div class="col-12 col-lg-8 d-flex">
                      <div class="card border shadow-none w-100">
                        <div class="card-body">
                          <div class="table-responsive">
                             <table class="table align-middle">
                               <thead class="table-light">
                                 <tr>
                                   <th>ID</th>
                                   <th>Name</th>
                                   <th>Slug</th>
                                   <th>Order</th>
                                   <th>Action</th>
                                 </tr>
                               </thead>
                               <tbody>
                                 <tr>
                                   <td>#85462</td>
                                   <td>Fashion</td>
                                   <td>/fashion</td>
                                   <td>54</td>
                                   <td>
                                    <div class="d-flex align-items-center gap-3 fs-6">
                                      <a href="javascript:;" class="text-primary" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="View detail" aria-label="Views"><i class="bi bi-eye-fill"></i></a>
                                      <a href="javascript:;" class="text-warning" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Edit info" aria-label="Edit"><i class="bi bi-pencil-fill"></i></a>
                                      <a href="javascript:;" class="text-danger" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Delete" aria-label="Delete"><i class="bi bi-trash-fill"></i></a>
                                    </div>
                                   </td>
                                 </tr>
                               </tbody>
                             </table>
                          </div>
                        </div>
                      </div>
                    </div>
                   </div>
                </div>
              </div>