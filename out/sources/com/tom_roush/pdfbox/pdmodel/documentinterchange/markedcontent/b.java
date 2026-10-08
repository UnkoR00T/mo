package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import bp.d;
import bp.i;
import hp.c;

/* JADX INFO: loaded from: classes4.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d f36990a;

    protected b() {
        this.f36990a = new d();
    }

    public static b a(d dVar) {
        bp.b bVarC4 = dVar.C4(i.f20732e9);
        if (i.f20709c6.equals(bVarC4)) {
            return new rp.a(dVar);
        }
        return i.f20729e6.equals(bVarC4) ? new rp.b(dVar) : new b(dVar);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d D1() {
        return this.f36990a;
    }

    protected b(d dVar) {
        this.f36990a = dVar;
    }
}
