package in;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f93501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f93502b;

    public c(a aVar) {
        this.f93501a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f93502b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i15) {
        if (i15 >= this.f93502b.size()) {
            List<b> list = this.f93502b;
            b bVarG = list.get(list.size() - 1);
            for (int size = this.f93502b.size(); size <= i15; size++) {
                a aVar = this.f93501a;
                bVarG = bVarG.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f93502b.add(bVarG);
            }
        }
        return this.f93502b.get(i15);
    }

    public void b(int[] iArr, int i15) {
        if (i15 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i15;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b bVarA = a(i15);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrD = new b(this.f93501a, iArr2).h(i15, 1).b(bVarA)[1].d();
        int length2 = i15 - iArrD.length;
        for (int i16 = 0; i16 < length2; i16++) {
            iArr[length + i16] = 0;
        }
        System.arraycopy(iArrD, 0, iArr, length + length2, iArrD.length);
    }
}
