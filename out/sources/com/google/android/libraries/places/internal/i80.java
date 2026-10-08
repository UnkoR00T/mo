package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface i80 {
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    default void a(q70 q70Var, long j15, List list, List list2) {
        boolean z15;
        boolean z16;
        if (list != null) {
            if (list.size() == q70Var.f31772c.size()) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        zj.p.h(z15, "Incorrect number of required labels provided. Expected: %s", q70Var.f31772c.size());
        if (list2 != null) {
            z16 = list2.size() == q70Var.f31773d.size();
        }
        zj.p.h(z16, "Incorrect number of optional labels provided. Expected: %s", q70Var.f31773d.size());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    default void b(p70 p70Var, long j15, List list, List list2) {
        boolean z15;
        boolean z16;
        if (list != null) {
            if (list.size() == p70Var.f31772c.size()) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        zj.p.h(z15, "Incorrect number of required labels provided. Expected: %s", p70Var.f31772c.size());
        if (list2 != null) {
            z16 = list2.size() == p70Var.f31773d.size();
        }
        zj.p.h(z16, "Incorrect number of optional labels provided. Expected: %s", p70Var.f31773d.size());
    }
}
