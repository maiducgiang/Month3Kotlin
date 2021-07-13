package com.example.connectdatauser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/connectdatauser/Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/connectdatauser/Adapter$Viewholder;", "arrUser", "Ljava/util/ArrayList;", "Lcom/example/connectdatauser/UserData;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getArrUser", "()Ljava/util/ArrayList;", "fragment", "Landroidx/fragment/app/Fragment;", "statusFarvorite", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Viewholder", "app_debug"})
public final class Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.connectdatauser.Adapter.Viewholder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.connectdatauser.UserData> arrUser = null;
    private int statusFarvorite = 1;
    private androidx.fragment.app.Fragment fragment;
    
    public Adapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.connectdatauser.UserData> arrUser) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.connectdatauser.UserData> getArrUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.connectdatauser.Adapter.Viewholder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.connectdatauser.Adapter.Viewholder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/connectdatauser/Adapter$Viewholder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/connectdatauser/databinding/ItemBinding;", "(Lcom/example/connectdatauser/databinding/ItemBinding;)V", "getBinding", "()Lcom/example/connectdatauser/databinding/ItemBinding;", "app_debug"})
    public static final class Viewholder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.connectdatauser.databinding.ItemBinding binding = null;
        
        public Viewholder(@org.jetbrains.annotations.NotNull()
        com.example.connectdatauser.databinding.ItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.connectdatauser.databinding.ItemBinding getBinding() {
            return null;
        }
    }
}