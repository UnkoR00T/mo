package bh;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f19431a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f19432b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    g f19433c;

    public final h a(Object obj, Object obj2) {
        int i15 = this.f19432b + 1;
        Object[] objArr = this.f19431a;
        int length = objArr.length;
        int i16 = i15 + i15;
        if (i16 > length) {
            this.f19431a = Arrays.copyOf(objArr, b.a(length, i16));
        }
        a1.a(obj, obj2);
        Object[] objArr2 = this.f19431a;
        int i17 = this.f19432b;
        int i18 = i17 + i17;
        objArr2[i18] = obj;
        objArr2[i18 + 1] = obj2;
        this.f19432b = i17 + 1;
        return this;
    }

    public final i b() {
        g gVar = this.f19433c;
        if (gVar != null) {
            throw gVar.a();
        }
        q qVarG = q.g(this.f19432b, this.f19431a, this);
        g gVar2 = this.f19433c;
        if (gVar2 == null) {
            return qVarG;
        }
        throw gVar2.a();
    }
}
