package zz;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p087nuL.b0;
import p087nuL.d0;
import pq.v;
import vq.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R.\u0010\u0018\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lzz/d;", "Loz/b;", "", "", "Landroid/net/Uri;", "Lzz/b;", "Lzz/c;", "Lzz/f;", "fileTypeMapper", "<init>", "(Lzz/f;)V", "", "Lwx/f;", "fileTypes", "Lzz/e;", "i", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "d", "Lzz/f;", "LnuL/b0;", "e", "LnuL/b0;", "r", "()LnuL/b0;", "contract", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends oz.b<String[], Uri> implements b, c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f fileTypeMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0<String[], Uri> contract = new d0();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f238538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f238539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f238540f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f238541g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f238543j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f238541g = obj;
            this.f238543j |= PKIFailureInfo.systemUnavail;
            return d.this.i(null, this);
        }
    }

    public d(f fVar) {
        this.fileTypeMapper = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zz.b
    public Object i(List<? extends wx.f> list, tq.e<? super e> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f238543j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f238543j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objS = aVar.f238541g;
        Object objE = uq.b.e();
        int i16 = aVar.f238543j;
        try {
            if (i16 == 0) {
                u.b(objS);
                List<? extends wx.f> list2 = list;
                ArrayList arrayList = new ArrayList(v.y(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.fileTypeMapper.b(new f.Params((wx.f) it.next())));
                }
                List listA = v.A(arrayList);
                Object[] array = listA.toArray(new String[0]);
                aVar.f238538d = j.a(list);
                aVar.f238539e = j.a(listA);
                aVar.f238540f = 0;
                aVar.f238543j = 1;
                objS = s(array, aVar);
                if (objS == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(objS);
            }
            return new e.UriResult((Uri) objS);
        } catch (ActivityNotFoundException unused) {
            return e.a.f238544a;
        }
    }

    @Override // oz.b
    public b0<String[], Uri> r() {
        return this.contract;
    }
}
