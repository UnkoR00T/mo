package pr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f*\u00060\u0004j\u0002`\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f*\u00060\u0004j\u0002`\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00102\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\f*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010&\u001a\u00020\f*\u00060\u0004j\u0002`\u00052\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010 \u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J-\u0010)\u001a\u00020\f*\u00060\u0004j\u0002`\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00102\n\u00100\u001a\u0006\u0012\u0002\b\u00030/¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\u00102\n\u00104\u001a\u0006\u0012\u0002\b\u000303¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u00020\u00102\n\u00107\u001a\u0006\u0012\u0002\b\u000303¢\u0006\u0004\b8\u00106J\u0015\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u001d¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lpr/t3;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lmr/k;", "receiver", "j", "(Ljava/lang/StringBuilder;Lmr/k;)Ljava/lang/StringBuilder;", "Lmr/b;", "callable", "Loq/i0;", "k", "(Ljava/lang/StringBuilder;Lmr/b;)V", "g", "", "name", "i", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "m", "(Lmr/b;)Ljava/lang/String;", "Lpr/a;", "type", "Lmr/c;", "klass", "Lzs/d;", "l", "(Lpr/a;Lmr/c;)Lzs/d;", "Lmr/p;", "s", "(Ljava/lang/StringBuilder;Lmr/p;)V", "classFqName", "", "Lmr/r;", "allArguments", "", "isMarkedNullable", "x", "(Ljava/lang/StringBuilder;Lmr/c;Lzs/d;Ljava/util/List;Z)V", "typeArguments", "A", "(Ljava/lang/StringBuilder;Ljava/util/List;Z)V", "lowerRendered", "upperRendered", "n", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lmr/l;", "property", "w", "(Lmr/l;)Ljava/lang/String;", "Lmr/g;", "function", "q", "(Lmr/g;)Ljava/lang/String;", "lambda", "t", "parameter", "v", "(Lmr/k;)Ljava/lang/String;", "y", "(Lmr/p;)Ljava/lang/String;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t3 f161969a = new t3();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161970a;

        static {
            int[] iArr = new int[mr.k.a.values().length];
            try {
                iArr[mr.k.a.INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mr.k.a.CONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mr.k.a.EXTENSION_RECEIVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mr.k.a.VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f161970a = iArr;
        }
    }

    private t3() {
    }

    private final void A(StringBuilder sb5, List<mr.r> list, boolean z15) throws IOException {
        StringBuilder sb6;
        if (list.isEmpty()) {
            sb6 = sb5;
        } else {
            sb6 = sb5;
            pq.g0.s0(list, sb6, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (z15) {
            sb6.append("?");
        }
    }

    private final void g(StringBuilder sb5, mr.b<?> bVar) throws IOException {
        List<mr.k> listA = nr.c.a(bVar);
        if (listA.isEmpty()) {
            return;
        }
        pq.g0.s0(listA, sb5, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : "context(", (124 & 8) == 0 ? ") " : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : n3.f161910a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h(mr.k kVar) {
        StringBuilder sb5 = new StringBuilder();
        String name = kVar.getName();
        if (name == null) {
            name = "_";
        }
        sb5.append(name);
        sb5.append(": ");
        sb5.append(kVar.getType());
        return sb5.toString();
    }

    private final void i(StringBuilder sb5, String str) {
        sb5.append(ct.j0.c(zs.f.l(str)));
    }

    private final StringBuilder j(StringBuilder sb5, mr.k kVar) {
        sb5.append(y(kVar.getType()));
        sb5.append(".");
        return sb5;
    }

    private final void k(StringBuilder sb5, mr.b<?> bVar) {
        List<mr.k> listZ = ((c0) bVar).Z();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            mr.k kVar = (mr.k) obj;
            if (kVar.getKind() == mr.k.a.INSTANCE || kVar.getKind() == mr.k.a.EXTENSION_RECEIVER) {
                arrayList.add(obj);
            }
        }
        mr.k kVar2 = (mr.k) pq.v.o0(arrayList, 0);
        if (kVar2 != null) {
            f161969a.j(sb5, kVar2);
        }
        mr.k kVar3 = (mr.k) pq.v.o0(arrayList, 1);
        if (kVar3 != null) {
            t3 t3Var = f161969a;
            sb5.append("(");
            t3Var.j(sb5, kVar3).append(")");
        }
    }

    private final zs.d l(pr.a type, mr.c<?> klass) {
        if (type.h()) {
            return sr.p.a.f183633c;
        }
        String strC = klass.C();
        if (strC == null) {
            return null;
        }
        zs.d dVar = new zs.d(strC);
        if (!type.g()) {
            return dVar;
        }
        zs.c cVarP = ur.c.f200031a.p(dVar);
        if (cVarP != null) {
            return cVarP.i();
        }
        return null;
    }

    private final String m(mr.b<?> callable) {
        if (callable instanceof mr.l) {
            return w((mr.l) callable);
        }
        if (callable instanceof mr.g) {
            return q((mr.g) callable);
        }
        throw new IllegalStateException(("Illegal callable: " + callable).toString());
    }

    private final String n(String lowerRendered, String upperRendered) {
        if (fr.t.c(lowerRendered, fu.r.P(upperRendered, "?", "", false, 4, null))) {
            return fu.r.P(upperRendered, "?", "!", false, 4, null);
        }
        if (fu.r.F(upperRendered, "?", false, 2, null)) {
            if (fr.t.c(lowerRendered + '?', upperRendered)) {
                return lowerRendered + '!';
            }
        }
        if (fr.t.c('(' + lowerRendered + ")?", upperRendered)) {
            return '(' + lowerRendered + ")!";
        }
        String strE = ct.j0.e(lowerRendered, upperRendered, new r3(lowerRendered), new s3(lowerRendered), null, 16, null);
        if (strE != null) {
            return strE;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(String str) {
        String str2 = sr.p.D.a() + '.';
        if (!fu.r.V(str, str2, false, 2, null)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(String str) {
        String str2 = sr.p.B.a() + '.';
        if (!fu.r.V(str, str2, false, 2, null)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r(mr.k kVar) {
        return f161969a.y(kVar.getType());
    }

    private final void s(StringBuilder sb5, mr.p pVar) throws IOException {
        if (pVar.f()) {
            sb5.append("(");
        }
        pq.g0.s0(pq.v.g0(pVar.e(), 1), sb5, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ") -> " : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        sb5.append(pq.v.x0(pVar.e()));
        if (pVar.f()) {
            sb5.append(")?");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence u(mr.k kVar) {
        return f161969a.y(kVar.getType());
    }

    private final void x(StringBuilder sb5, mr.c<?> cVar, zs.d dVar, List<mr.r> list, boolean z15) throws IOException {
        StringBuilder sb6;
        if (cVar.getTypeParameters().size() >= list.size() || dr.a.b(cVar).getDeclaringClass() == null) {
            sb6 = sb5;
            sb6.append(ct.j0.b(dVar));
        } else {
            sb6 = sb5;
            x(sb6, dr.a.e(dr.a.b(cVar).getDeclaringClass()), dVar.g(), pq.v.f0(list, cVar.getTypeParameters().size()), false);
            sb6.append(".");
            sb6.append(ct.j0.c(dVar.j()));
        }
        A(sb6, pq.v.X0(list, cVar.getTypeParameters().size()), z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence z(zs.f fVar) {
        return ct.j0.c(fVar);
    }

    public final String q(mr.g<?> function) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        t3 t3Var = f161969a;
        t3Var.g(sb5, function);
        sb5.append("fun ");
        t3Var.k(sb5, function);
        t3Var.i(sb5, function.getName());
        pq.g0.s0(nr.c.c(function), sb5, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : o3.f161915a);
        sb5.append(": ");
        sb5.append(t3Var.y(function.f()));
        return sb5.toString();
    }

    public final String t(mr.g<?> lambda) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        mr.k kVarB = nr.c.b(lambda);
        if (kVarB != null) {
            sb5.append(f161969a.y(kVarB.getType()));
            sb5.append(".");
        }
        pq.g0.s0(nr.c.c(lambda), sb5, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : p3.f161931a);
        sb5.append(" -> ");
        sb5.append(f161969a.y(lambda.f()));
        return sb5.toString();
    }

    public final String v(mr.k parameter) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = a.f161970a[parameter.getKind().ordinal()];
        if (i15 == 1) {
            sb5.append("instance parameter");
        } else if (i15 == 2) {
            sb5.append("context parameter " + parameter.getName());
        } else if (i15 == 3) {
            sb5.append("extension receiver parameter");
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            sb5.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb5.append(" of ");
        sb5.append(f161969a.m(((e2) parameter).h()));
        return sb5.toString();
    }

    public final String w(mr.l<?> property) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        t3 t3Var = f161969a;
        t3Var.g(sb5, property);
        sb5.append(property instanceof mr.h ? "var " : "val ");
        t3Var.k(sb5, property);
        t3Var.i(sb5, property.getName());
        sb5.append(": ");
        sb5.append(t3Var.y(property.f()));
        return sb5.toString();
    }

    public final String y(mr.p type) throws IOException {
        pr.a aVar = (pr.a) type;
        pr.a aVarI = aVar.i();
        pr.a aVarJ = aVar.j();
        if (aVarI != null && aVarJ != null) {
            return n(y(aVarI), y(aVarJ));
        }
        StringBuilder sb5 = new StringBuilder();
        mr.p pVarB = aVar.b();
        if (pVarB != null) {
            sb5.append(pVarB);
            sb5.append(" /* = ");
        }
        mr.e eVarD = type.d();
        if (eVarD instanceof mr.q) {
            f161969a.i(sb5, ((mr.q) eVarD).getName());
            if (type.f()) {
                sb5.append("?");
            } else if (((pr.a) type).c()) {
                sb5.append(" & Any");
            }
        } else if (eVarD instanceof mr.c) {
            t3 t3Var = f161969a;
            mr.c<?> cVar = (mr.c) eVarD;
            zs.d dVarL = t3Var.l((pr.a) type, cVar);
            if (dVarL == null) {
                dVarL = new zs.d(or.b.a(cVar));
            }
            if (!sr.i.r(dVarL) || type.e().contains(mr.r.INSTANCE.c())) {
                t3Var.x(sb5, cVar, dVarL, type.e(), type.f());
            } else {
                t3Var.s(sb5, type);
            }
        } else if (eVarD instanceof y2) {
            pq.g0.s0(((y2) eVarD).getFqName().e(), sb5, (124 & 2) != 0 ? ", " : ".", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : q3.f161951a);
            f161969a.A(sb5, type.e(), type.f());
        } else {
            sb5.append("???");
        }
        if (((pr.a) type).b() != null) {
            sb5.append(" */");
        }
        return sb5.toString();
    }
}
