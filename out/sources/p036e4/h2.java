package p036e4;

import androidx.compose.ui.node.g;
import er.l;
import fr.w;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le4/h2;", "Landroidx/compose/ui/node/g$f;", "<init>", "()V", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h2 extends g.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2 f47261b = new h2();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47262b = new a();

        a() {
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
    static final class b extends w implements l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f47263b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a2 a2Var) {
            super(1);
            this.f47263b = a2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            a2.a.R(aVar, this.f47263b, 0, 0, 0.0f, null, 12, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<a2> f47264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends a2> list) {
            super(1);
            this.f47264b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            List<a2> list = this.f47264b;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                a2.a.R(aVar, list.get(i15), 0, 0, 0.0f, null, 12, null);
            }
        }
    }

    private h2() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // p036e4.w0
    public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
        int size = list.size();
        if (size == 0) {
            return y0.j2(y0Var, c5.b.n(j15), c5.b.m(j15), null, a.f47262b, 4, null);
        }
        if (size == 1) {
            a2 a2VarO0 = list.get(0).o0(j15);
            return y0.j2(y0Var, c5.c.g(j15, a2VarO0.getWidth()), c5.c.f(j15, a2VarO0.getHeight()), null, new b(a2VarO0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < size2; i15++) {
            a2 a2VarO1 = list.get(i15).o0(j15);
            iMax = Math.max(a2VarO1.getWidth(), iMax);
            iMax2 = Math.max(a2VarO1.getHeight(), iMax2);
            arrayList.add(a2VarO1);
        }
        return y0.j2(y0Var, c5.c.g(j15, iMax), c5.c.f(j15, iMax2), null, new c(arrayList), 4, null);
    }
}
