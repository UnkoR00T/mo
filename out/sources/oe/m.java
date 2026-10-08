package oe;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<androidx.p016lifecycle.j, com.bumptech.glide.l> f144990a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f144991b;

    class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.j f144992a;

        a(androidx.p016lifecycle.j jVar) {
            this.f144992a = jVar;
        }

        @Override // oe.l
        public void e() {
        }

        @Override // oe.l
        public void g() {
            m.this.f144990a.remove(this.f144992a);
        }

        @Override // oe.l
        public void n() {
        }
    }

    private final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FragmentManager f144994a;

        b(FragmentManager fragmentManager) {
            this.f144994a = fragmentManager;
        }

        private void b(FragmentManager fragmentManager, Set<com.bumptech.glide.l> set) {
            List<androidx.fragment.app.o> listX0 = fragmentManager.x0();
            int size = listX0.size();
            for (int i15 = 0; i15 < size; i15++) {
                androidx.fragment.app.o oVar = listX0.get(i15);
                b(oVar.y(), set);
                com.bumptech.glide.l lVarA = m.this.a(oVar.getLifecycleRegistry());
                if (lVarA != null) {
                    set.add(lVarA);
                }
            }
        }

        @Override // oe.p
        public Set<com.bumptech.glide.l> a() {
            HashSet hashSet = new HashSet();
            b(this.f144994a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f144991b = bVar;
    }

    com.bumptech.glide.l a(androidx.p016lifecycle.j jVar) {
        ve.l.a();
        return this.f144990a.get(jVar);
    }

    com.bumptech.glide.l b(Context context, com.bumptech.glide.b bVar, androidx.p016lifecycle.j jVar, FragmentManager fragmentManager, boolean z15) {
        ve.l.a();
        com.bumptech.glide.l lVarA = a(jVar);
        if (lVarA != null) {
            return lVarA;
        }
        k kVar = new k(jVar);
        com.bumptech.glide.l lVarA2 = this.f144991b.a(bVar, kVar, new b(fragmentManager), context);
        this.f144990a.put(jVar, lVarA2);
        kVar.a(new a(jVar));
        if (z15) {
            lVarA2.n();
        }
        return lVarA2;
    }
}
