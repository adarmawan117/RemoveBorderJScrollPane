private void setScrollPanel() {
    jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(1, 0));
    jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(1, 0));

    jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
    jScrollPane1.getHorizontalScrollBar().setUnitIncrement(16);

    jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
}
