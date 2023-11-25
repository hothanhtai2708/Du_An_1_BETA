/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui;
/**
 *
 * @author PC
 */
public class TrangChu extends javax.swing.JDialog {

    /**
     * Creates new form TrangChu
     */
    public TrangChu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    public void init(){
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnTong = new javax.swing.JPanel();
        jpnUser = new javax.swing.JPanel();
        lblXinChao = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        jpnDanhMuc = new javax.swing.JPanel();
        btnHoaDon = new javax.swing.JButton();
        btnViTri = new javax.swing.JButton();
        btnChucVu = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnKho = new javax.swing.JButton();
        btnDoUong = new javax.swing.JButton();
        btnNhapHang = new javax.swing.JButton();
        jpnQuanLyTacVu = new javax.swing.JPanel();
        jpbKhuVuc = new javax.swing.JPanel();
        lblMaKhuVuc = new javax.swing.JLabel();
        lblTenKhuVuc = new javax.swing.JLabel();
        txtMaKhuVuc = new javax.swing.JTextField();
        txtTenKhuVuc = new javax.swing.JTextField();
        btnThemKV = new javax.swing.JButton();
        btnSuaKV = new javax.swing.JButton();
        btnNhapLaiKV = new javax.swing.JButton();
        btnXoaKhuVuc = new javax.swing.JButton();
        lblKhuVuc = new javax.swing.JLabel();
        jpnBangKhuVuc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhuVuc = new javax.swing.JTable();
        jpnBan = new javax.swing.JPanel();
        lblKhuVucBan = new javax.swing.JLabel();
        lblSoBan = new javax.swing.JLabel();
        txtKhuVuc = new javax.swing.JTextField();
        txtSoBan = new javax.swing.JTextField();
        btnThemBan = new javax.swing.JButton();
        btnNhapLaiBan = new javax.swing.JButton();
        btnXoaBan = new javax.swing.JButton();
        lblBan = new javax.swing.JLabel();
        jpnDanhSachBan = new javax.swing.JPanel();
        btnBan1 = new javax.swing.JButton();
        btnBan2 = new javax.swing.JButton();
        btnBan3 = new javax.swing.JButton();
        btnBan4 = new javax.swing.JButton();
        btnBan5 = new javax.swing.JButton();
        btnBan6 = new javax.swing.JButton();
        btnBan7 = new javax.swing.JButton();
        btnBan8 = new javax.swing.JButton();
        btnBan9 = new javax.swing.JButton();
        btnBan10 = new javax.swing.JButton();
        lblThongTinQuan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpnTong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpnUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblXinChao.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblXinChao.setText("Xin Chào:abc");

        lblChucVu.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblChucVu.setText("Chức vụ: abc");

        javax.swing.GroupLayout jpnUserLayout = new javax.swing.GroupLayout(jpnUser);
        jpnUser.setLayout(jpnUserLayout);
        jpnUserLayout.setHorizontalGroup(
            jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblXinChao)
                    .addComponent(lblChucVu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnUserLayout.setVerticalGroup(
            jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblXinChao)
                .addGap(18, 18, 18)
                .addComponent(lblChucVu)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jpnDanhMuc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Quản lý chức năng\n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 17))); // NOI18N
        jpnDanhMuc.setName(""); // NOI18N

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/List.png"))); // NOI18N
        btnHoaDon.setText("HÓA ĐƠN");
        buttonGroup1.add(btnHoaDon);
        btnHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnViTri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Smile.png"))); // NOI18N
        btnViTri.setText("CA LÀM VIỆC");
        btnViTri.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnChucVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Certificate.png"))); // NOI18N
        btnChucVu.setText("CHỨC VỤ ");
        btnChucVu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        btnNhanVien.setText("NHÂN VIÊN ");
        btnNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bell.png"))); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Brick house.png"))); // NOI18N
        btnKho.setText("KHO");
        btnKho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnDoUong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Yin-Yang.png"))); // NOI18N
        btnDoUong.setText("ĐỒ UỐNG");
        btnDoUong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Scroll list.png"))); // NOI18N
        btnNhapHang.setText("NHẬP HÀNG");
        btnNhapHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jpnDanhMucLayout = new javax.swing.GroupLayout(jpnDanhMuc);
        jpnDanhMuc.setLayout(jpnDanhMucLayout);
        jpnDanhMucLayout.setHorizontalGroup(
            jpnDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhMucLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDoUong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(btnKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDanhMucLayout.setVerticalGroup(
            jpnDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhMucLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnDoUong, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnKho, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnQuanLyTacVu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Quản lý tác vụ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jpbKhuVuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMaKhuVuc.setText("Mã Khu Vực:");

        lblTenKhuVuc.setText("Tên Khu Vực:");

        btnThemKV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        btnThemKV.setText("THÊM ");

        btnSuaKV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit.png"))); // NOI18N
        btnSuaKV.setText("SỬA ");

        btnNhapLaiKV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        btnNhapLaiKV.setText("NHẬP LẠI ");

        btnXoaKhuVuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        btnXoaKhuVuc.setText("XÓA");

        javax.swing.GroupLayout jpbKhuVucLayout = new javax.swing.GroupLayout(jpbKhuVuc);
        jpbKhuVuc.setLayout(jpbKhuVucLayout);
        jpbKhuVucLayout.setHorizontalGroup(
            jpbKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbKhuVucLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpbKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpbKhuVucLayout.createSequentialGroup()
                        .addGroup(jpbKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpbKhuVucLayout.createSequentialGroup()
                                .addComponent(lblMaKhuVuc)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpbKhuVucLayout.createSequentialGroup()
                                .addComponent(lblTenKhuVuc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpbKhuVucLayout.createSequentialGroup()
                        .addComponent(btnThemKV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSuaKV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNhapLaiKV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaKhuVuc)
                        .addContainerGap())))
        );
        jpbKhuVucLayout.setVerticalGroup(
            jpbKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbKhuVucLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpbKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKhuVuc)
                    .addComponent(txtMaKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpbKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKhuVuc)
                    .addComponent(txtTenKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpbKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemKV)
                    .addComponent(btnSuaKV)
                    .addComponent(btnNhapLaiKV)
                    .addComponent(btnXoaKhuVuc))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblKhuVuc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblKhuVuc.setText("Khu Vực");

        jpnBangKhuVuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblKhuVuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "MÃ KHU VỰC", "TÊN KHU VỰC"
            }
        ));
        jScrollPane1.setViewportView(tblKhuVuc);

        javax.swing.GroupLayout jpnBangKhuVucLayout = new javax.swing.GroupLayout(jpnBangKhuVuc);
        jpnBangKhuVuc.setLayout(jpnBangKhuVucLayout);
        jpnBangKhuVucLayout.setHorizontalGroup(
            jpnBangKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpnBangKhuVucLayout.setVerticalGroup(
            jpnBangKhuVucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );

        jpnBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblKhuVucBan.setText("Khu Vực:");

        lblSoBan.setText("Số Bàn:");

        btnThemBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        btnThemBan.setText("THÊM ");

        btnNhapLaiBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        btnNhapLaiBan.setText("NHẬP LẠI ");

        btnXoaBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        btnXoaBan.setText("XÓA");

        javax.swing.GroupLayout jpnBanLayout = new javax.swing.GroupLayout(jpnBan);
        jpnBan.setLayout(jpnBanLayout);
        jpnBanLayout.setHorizontalGroup(
            jpnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBanLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jpnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnBanLayout.createSequentialGroup()
                        .addGroup(jpnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKhuVucBan)
                            .addComponent(lblSoBan))
                        .addGap(18, 18, 18)
                        .addGroup(jpnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnBanLayout.createSequentialGroup()
                        .addComponent(btnThemBan)
                        .addGap(32, 32, 32)
                        .addComponent(btnNhapLaiBan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaBan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBanLayout.setVerticalGroup(
            jpnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBanLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jpnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhuVucBan)
                    .addComponent(txtKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoBan)
                    .addComponent(txtSoBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemBan)
                    .addComponent(btnNhapLaiBan)
                    .addComponent(btnXoaBan))
                .addGap(15, 15, 15))
        );

        lblBan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBan.setText("Bàn ");

        javax.swing.GroupLayout jpnQuanLyTacVuLayout = new javax.swing.GroupLayout(jpnQuanLyTacVu);
        jpnQuanLyTacVu.setLayout(jpnQuanLyTacVuLayout);
        jpnQuanLyTacVuLayout.setHorizontalGroup(
            jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTacVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpnBangKhuVuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpbKhuVuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKhuVuc, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(lblBan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQuanLyTacVuLayout.setVerticalGroup(
            jpnQuanLyTacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTacVuLayout.createSequentialGroup()
                .addComponent(lblKhuVuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpbKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnBangKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblBan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnDanhSachBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBan1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan1.setText("BÀN 1");

        btnBan2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan2.setText("BÀN 2");

        btnBan3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan3.setText("BÀN 3");

        btnBan4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan4.setText("BÀN 4");

        btnBan5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan5.setText("BÀN 5");

        btnBan6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan6.setText("BÀN 6");

        btnBan7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan7.setText("BÀN 7");

        btnBan8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan8.setText("BÀN 8");

        btnBan9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan9.setText("BÀN 9");

        btnBan10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBan10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gift.png"))); // NOI18N
        btnBan10.setText("BÀN 10");

        javax.swing.GroupLayout jpnDanhSachBanLayout = new javax.swing.GroupLayout(jpnDanhSachBan);
        jpnDanhSachBan.setLayout(jpnDanhSachBanLayout);
        jpnDanhSachBanLayout.setHorizontalGroup(
            jpnDanhSachBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhSachBanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDanhSachBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDanhSachBanLayout.createSequentialGroup()
                        .addComponent(btnBan1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBan2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBan3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBan4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBan5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnDanhSachBanLayout.createSequentialGroup()
                        .addComponent(btnBan6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBan7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBan8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBan9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBan10)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpnDanhSachBanLayout.setVerticalGroup(
            jpnDanhSachBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhSachBanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDanhSachBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBan1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnDanhSachBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBan6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBan10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnTongLayout = new javax.swing.GroupLayout(jpnTong);
        jpnTong.setLayout(jpnTongLayout);
        jpnTongLayout.setHorizontalGroup(
            jpnTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyTacVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnDanhSachBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTongLayout.setVerticalGroup(
            jpnTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTongLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jpnTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnDanhSachBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQuanLyTacVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnTongLayout.createSequentialGroup()
                        .addComponent(jpnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblThongTinQuan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblThongTinQuan.setText("THÔNG TIN QUÁN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblThongTinQuan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpnTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblThongTinQuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TrangChu dialog = new TrangChu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBan1;
    private javax.swing.JButton btnBan10;
    private javax.swing.JButton btnBan2;
    private javax.swing.JButton btnBan3;
    private javax.swing.JButton btnBan4;
    private javax.swing.JButton btnBan5;
    private javax.swing.JButton btnBan6;
    private javax.swing.JButton btnBan7;
    private javax.swing.JButton btnBan8;
    private javax.swing.JButton btnBan9;
    private javax.swing.JButton btnChucVu;
    private javax.swing.JButton btnDoUong;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKho;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnNhapHang;
    private javax.swing.JButton btnNhapLaiBan;
    private javax.swing.JButton btnNhapLaiKV;
    private javax.swing.JButton btnSuaKV;
    private javax.swing.JButton btnThemBan;
    private javax.swing.JButton btnThemKV;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnViTri;
    private javax.swing.JButton btnXoaBan;
    private javax.swing.JButton btnXoaKhuVuc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpbKhuVuc;
    private javax.swing.JPanel jpnBan;
    private javax.swing.JPanel jpnBangKhuVuc;
    private javax.swing.JPanel jpnDanhMuc;
    private javax.swing.JPanel jpnDanhSachBan;
    private javax.swing.JPanel jpnQuanLyTacVu;
    private javax.swing.JPanel jpnTong;
    private javax.swing.JPanel jpnUser;
    private javax.swing.JLabel lblBan;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblKhuVuc;
    private javax.swing.JLabel lblKhuVucBan;
    private javax.swing.JLabel lblMaKhuVuc;
    private javax.swing.JLabel lblSoBan;
    private javax.swing.JLabel lblTenKhuVuc;
    private javax.swing.JLabel lblThongTinQuan;
    private javax.swing.JLabel lblXinChao;
    private javax.swing.JTable tblKhuVuc;
    private javax.swing.JTextField txtKhuVuc;
    private javax.swing.JTextField txtMaKhuVuc;
    private javax.swing.JTextField txtSoBan;
    private javax.swing.JTextField txtTenKhuVuc;
    // End of variables declaration//GEN-END:variables

}

