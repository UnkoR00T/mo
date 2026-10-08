package com.google.android.libraries.places.internal;

import java.net.Socket;

/* JADX INFO: loaded from: classes4.dex */
public final class tr0 {
    public static final cs0 a(Socket socket) {
        int i15 = ur0.f33972a;
        ds0 ds0Var = new ds0(socket);
        return new kr0(ds0Var, new vr0(socket.getOutputStream(), ds0Var));
    }

    public static final es0 b(Socket socket) {
        int i15 = ur0.f33972a;
        ds0 ds0Var = new ds0(socket);
        return new lr0(ds0Var, new sr0(socket.getInputStream(), ds0Var));
    }

    public static final pr0 c(es0 es0Var) {
        return new xr0(es0Var);
    }

    public static final or0 d(cs0 cs0Var) {
        return new wr0(cs0Var);
    }
}
