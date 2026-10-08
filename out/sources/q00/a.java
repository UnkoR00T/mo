package q00;

import ay.ContentDisposition;
import ay.ResponseWithHeaders;
import ay.p;
import dx.i;
import fr.k;
import fu.l;
import fu.o;
import fu.r;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import vq.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lq00/a;", "Lay/e;", "Lay/p;", "urlDecoder", "<init>", "(Lay/p;)V", "T", "Lay/m;", "responseWithHeaders", "Ldx/i;", "Ldx/b;", "Lay/d;", "a", "(Lay/m;Ltq/e;)Ljava/lang/Object;", "Lay/p;", "b", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ay.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4052a f163377b = new C4052a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f163378c = new o("([^']*)'[^']*'(.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p urlDecoder;

    /* JADX INFO: renamed from: q00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lq00/a$a;", "", "<init>", "()V", "", "FILENAME_PREFIX", "Ljava/lang/String;", "ENCODED_FILENAME_PREFIX", "HEADER_VALUE", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C4052a {
        public /* synthetic */ C4052a(k kVar) {
            this();
        }

        private C4052a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f163380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f163381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f163382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f163383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f163384h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f163385j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f163386k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f163387l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f163388m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f163389n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f163390p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f163392r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f163390p = obj;
            this.f163392r |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(p pVar) {
        this.urlDecoder = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ay.e
    public <T> Object a(ResponseWithHeaders<T> responseWithHeaders, tq.e<? super i<? extends dx.b, ContentDisposition>> eVar) throws Throwable {
        b bVar;
        String str;
        ArrayList arrayList;
        String strV1;
        T next;
        String strM0;
        l lVarC;
        String str2;
        T next2;
        String strM1;
        String str3;
        List listV0;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f163392r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f163392r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f163390p;
        Object objE = uq.b.e();
        int i16 = bVar.f163392r;
        try {
            if (i16 == 0) {
                u.b(objA);
                List<String> list = responseWithHeaders.b().get("content-disposition");
                str = null;
                if (list == null || (str3 = (String) v.n0(list)) == null || (listV0 = r.V0(str3, new String[]{";"}, false, 0, 6, null)) == null) {
                    arrayList = null;
                } else {
                    List list2 = listV0;
                    arrayList = new ArrayList(v.y(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(r.u1((String) it.next()).toString());
                    }
                }
                if (arrayList != null) {
                    Iterator<T> it4 = arrayList.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next2 = (T) null;
                            break;
                        }
                        next2 = it4.next();
                    } while (!r.V((String) next2, "filename=", false, 2, null));
                    String str4 = next2;
                    if (str4 == null || (strM1 = r.M0(str4, "filename=")) == null) {
                        strV1 = null;
                    } else {
                        strV1 = r.v1(strM1, '\"');
                    }
                } else {
                    strV1 = null;
                }
                if (arrayList != null) {
                    Iterator<T> it5 = arrayList.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it5.next();
                    } while (!r.V((String) next, "filename*=", false, 2, null));
                    String str5 = next;
                    if (str5 != null && (lVarC = o.c(f163378c, (strM0 = r.M0(str5, "filename*=")), 0, 2, null)) != null) {
                        l.b bVarC = lVarC.c();
                        String str6 = bVarC.getMatch().d().get(1);
                        String str7 = bVarC.getMatch().d().get(2);
                        p pVar = this.urlDecoder;
                        bVar.f163380d = j.a(responseWithHeaders);
                        bVar.f163381e = j.a(arrayList);
                        bVar.f163382f = j.a(str5);
                        bVar.f163383g = j.a(strM0);
                        bVar.f163384h = j.a(lVarC);
                        bVar.f163385j = j.a(str6);
                        bVar.f163386k = j.a(str7);
                        bVar.f163387l = strV1;
                        bVar.f163388m = 0;
                        bVar.f163389n = 0;
                        bVar.f163392r = 1;
                        objA = pVar.a(str7, str6, bVar);
                        if (objA == objE) {
                            return objE;
                        }
                        str2 = strV1;
                    }
                }
                return new i.Right(new ContentDisposition(strV1, str));
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) bVar.f163387l;
            u.b(objA);
            str = (String) objA;
            strV1 = str2;
            return new i.Right(new ContentDisposition(strV1, str));
        } catch (UnsupportedEncodingException e15) {
            return new i.Left(new dx.b.Parsing(e15));
        }
    }
}
