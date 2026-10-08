package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<T> f36985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f36986b;

    private List<T> c() {
        if (this.f36985a == null) {
            this.f36985a = new ArrayList();
        }
        return this.f36985a;
    }

    private List<Integer> e() {
        if (this.f36986b == null) {
            this.f36986b = new ArrayList();
        }
        return this.f36986b;
    }

    public void a(T t15, int i15) {
        c().add(t15);
        e().add(Integer.valueOf(i15));
    }

    public T b(int i15) {
        return c().get(i15);
    }

    public int d(int i15) {
        return e().get(i15).intValue();
    }

    protected void f(T t15, int i15) {
        int iIndexOf = c().indexOf(t15);
        if (iIndexOf > -1) {
            e().set(iIndexOf, Integer.valueOf(i15));
        }
    }

    public int g() {
        return c().size();
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < c().size(); i15++) {
            if (i15 > 0) {
                sb5.append("; ");
            }
            sb5.append("object=");
            sb5.append(c().get(i15));
            sb5.append(", revisionNumber=");
            sb5.append(d(i15));
        }
        return sb5.toString();
    }
}
