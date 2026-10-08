package androidx.compose.ui.window;

import java.util.ArrayList;
import java.util.List;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 1, 0})
public final class c implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11083a = new c();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f11084b = new a();

        public a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends fr.w implements er.l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f11085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a2 a2Var) {
            super(1);
            this.f11085b = a2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            a2.a.I(aVar, this.f11085b, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C0247c extends fr.w implements er.l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<a2> f11086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0247c(List<? extends a2> list) {
            super(1);
            this.f11086b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            int iP = pq.v.p(this.f11086b);
            if (iP < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                a2.a aVar2 = aVar;
                a2.a.I(aVar2, this.f11086b.get(i15), 0, 0, 0.0f, 4, null);
                if (i15 == iP) {
                    return;
                }
                i15++;
                aVar = aVar2;
            }
        }
    }

    @Override // p036e4.w0
    public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
        int size = list.size();
        if (size == 0) {
            return y0.j2(y0Var, 0, 0, null, a.f11084b, 4, null);
        }
        if (size == 1) {
            a2 a2VarO0 = list.get(0).o0(j15);
            return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new b(a2VarO0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < size2; i15++) {
            a2 a2VarO1 = list.get(i15).o0(j15);
            iMax = Math.max(iMax, a2VarO1.getWidth());
            iMax2 = Math.max(iMax2, a2VarO1.getHeight());
            arrayList.add(a2VarO1);
        }
        return y0.j2(y0Var, iMax, iMax2, null, new C0247c(arrayList), 4, null);
    }
}
