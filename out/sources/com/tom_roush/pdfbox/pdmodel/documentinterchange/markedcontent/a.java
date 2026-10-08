package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import bp.d;
import bp.i;
import java.util.ArrayList;
import java.util.List;
import np.c;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f36988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Object> f36989c;

    public a(i iVar, d dVar) {
        this.f36987a = iVar == null ? null : iVar.A3();
        this.f36988b = dVar;
        this.f36989c = new ArrayList();
    }

    public static a d(i iVar, d dVar) {
        return i.O.equals(iVar) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.a(dVar) : new a(iVar, dVar);
    }

    public void a(a aVar) {
        g().add(aVar);
    }

    public void b(wp.a aVar) {
        g().add(aVar);
    }

    public void c(c cVar) {
        g().add(cVar);
    }

    public String e() {
        if (k() == null) {
            return null;
        }
        return k().L4(i.f20793l);
    }

    public String f() {
        if (k() == null) {
            return null;
        }
        return k().L4(i.f20940z);
    }

    public List<Object> g() {
        return this.f36989c;
    }

    public String h() {
        if (k() == null) {
            return null;
        }
        return k().L4(i.V2);
    }

    public String i() {
        if (k() == null) {
            return null;
        }
        return k().H4(i.T4);
    }

    public int j() {
        if (k() == null) {
            return -1;
        }
        return k().x4(i.f20946z5);
    }

    public d k() {
        return this.f36988b;
    }

    public String l() {
        return this.f36987a;
    }

    public String toString() {
        return "tag=" + this.f36987a + ", properties=" + this.f36988b + ", contents=" + this.f36989c;
    }
}
