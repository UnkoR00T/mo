package ff0;

import gf0.DocumentToGenerateEntity;
import gf0.DownloadTaskDataEntity;
import hf0.DownloadTaskWithDocuments;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0005J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0011\u0010\nJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0013\u0010\nJ\u001e\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0017\u0010\nJ\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0019\u0010\nJ&\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0097@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001d2\u0006\u0010\u0018\u001a\u00020\u0006H'¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00020\u001dH'¢\u0006\u0004\b!\u0010\"J(\u0010'\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H§@¢\u0006\u0004\b'\u0010(J \u0010*\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0010H§@¢\u0006\u0004\b*\u0010+JR\u00101\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00062\b\u00100\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b1\u00102¨\u00063À\u0006\u0003"}, d2 = {"Lff0/a;", "", "", "Lgf0/g;", "q", "(Ltq/e;)Ljava/lang/Object;", "", "taskId", "Lhf0/a;", "u", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "task", "Loq/i0;", "l", "(Lgf0/g;Ltq/e;)Ljava/lang/Object;", "a", "", "p", "Lgf0/d;", "r", "docs", "m", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "n", "documentId", "b", "documents", "o", "(Lgf0/g;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "s", "(Ljava/lang/String;)Lmu/g;", "h", "d", "()Lmu/g;", "Lgf0/e;", "docType", "Lgf0/b;", "status", "t", "(Ljava/lang/String;Lgf0/e;Lgf0/b;Ltq/e;)Ljava/lang/Object;", "isCompleted", "i", "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "businessCode", "message", "technicalCode", "title", "traceId", "k", "(Ljava/lang/String;Lgf0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: ff0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1406a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f62119g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62121j;

        C1406a(tq.e<? super C1406a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62119g = obj;
            this.f62121j |= PKIFailureInfo.systemUnavail;
            return a.j(a.this, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r9.m(r7, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object j(ff0.a r7, gf0.DownloadTaskDataEntity r8, java.util.List<gf0.DocumentToGenerateEntity> r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof ff0.a.C1406a
            if (r0 == 0) goto L13
            r0 = r10
            ff0.a$a r0 = (ff0.a.C1406a) r0
            int r1 = r0.f62121j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62121j = r1
            goto L18
        L13:
            ff0.a$a r0 = new ff0.a$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f62119g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f62121j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L66
            if (r2 == r5) goto L54
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f62118f
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f62117e
            gf0.g r7 = (gf0.DownloadTaskDataEntity) r7
            java.lang.Object r7 = r0.f62116d
            ff0.a r7 = (ff0.a) r7
            oq.u.b(r10)
            goto Lad
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            java.lang.Object r7 = r0.f62118f
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.f62117e
            gf0.g r8 = (gf0.DownloadTaskDataEntity) r8
            java.lang.Object r9 = r0.f62116d
            ff0.a r9 = (ff0.a) r9
            oq.u.b(r10)
            goto L92
        L54:
            java.lang.Object r7 = r0.f62118f
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r7 = r0.f62117e
            r8 = r7
            gf0.g r8 = (gf0.DownloadTaskDataEntity) r8
            java.lang.Object r7 = r0.f62116d
            ff0.a r7 = (ff0.a) r7
            oq.u.b(r10)
            goto L7c
        L66:
            oq.u.b(r10)
            java.lang.String r10 = r8.getTaskId()
            r0.f62116d = r7
            r0.f62117e = r8
            r0.f62118f = r9
            r0.f62121j = r5
            java.lang.Object r10 = r7.n(r10, r0)
            if (r10 != r1) goto L7c
            goto Lac
        L7c:
            r0.f62116d = r7
            java.lang.Object r10 = vq.j.a(r8)
            r0.f62117e = r10
            r0.f62118f = r9
            r0.f62121j = r4
            java.lang.Object r10 = r7.l(r8, r0)
            if (r10 != r1) goto L8f
            goto Lac
        L8f:
            r6 = r9
            r9 = r7
            r7 = r6
        L92:
            java.lang.Object r10 = vq.j.a(r9)
            r0.f62116d = r10
            java.lang.Object r8 = vq.j.a(r8)
            r0.f62117e = r8
            java.lang.Object r8 = vq.j.a(r7)
            r0.f62118f = r8
            r0.f62121j = r3
            java.lang.Object r7 = r9.m(r7, r0)
            if (r7 != r1) goto Lad
        Lac:
            return r1
        Lad:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ff0.a.j(ff0.a, gf0.g, java.util.List, tq.e):java.lang.Object");
    }

    Object a(tq.e<? super i0> eVar);

    Object b(String str, tq.e<? super i0> eVar);

    mu.g<List<DocumentToGenerateEntity>> d();

    mu.g<DocumentToGenerateEntity> h(String documentId);

    Object i(String str, boolean z15, tq.e<? super i0> eVar);

    Object k(String str, gf0.e eVar, String str2, String str3, String str4, String str5, String str6, tq.e<? super i0> eVar2);

    Object l(DownloadTaskDataEntity downloadTaskDataEntity, tq.e<? super i0> eVar);

    Object m(List<DocumentToGenerateEntity> list, tq.e<? super i0> eVar);

    Object n(String str, tq.e<? super i0> eVar);

    default Object o(DownloadTaskDataEntity downloadTaskDataEntity, List<DocumentToGenerateEntity> list, tq.e<? super i0> eVar) {
        return j(this, downloadTaskDataEntity, list, eVar);
    }

    Object p(String str, tq.e<? super Boolean> eVar);

    Object q(tq.e<? super List<DownloadTaskDataEntity>> eVar);

    Object r(String str, tq.e<? super List<DocumentToGenerateEntity>> eVar);

    mu.g<DownloadTaskWithDocuments> s(String taskId);

    Object t(String str, gf0.e eVar, gf0.b bVar, tq.e<? super i0> eVar2);

    Object u(String str, tq.e<? super DownloadTaskWithDocuments> eVar);
}
