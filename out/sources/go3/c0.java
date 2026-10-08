package go3;

import eo3.MultiDynamicDocumentData;
import eo3.VerificationSelector;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000279BY\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J<\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0082@¢\u0006\u0004\b\"\u0010#JN\u0010)\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%0$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010(\u001a\u0004\u0018\u00010'H\u0082@¢\u0006\u0004\b)\u0010*JB\u0010-\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001cH\u0082@¢\u0006\u0004\b-\u0010.J3\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\b\u0010/\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b2\u00103J$\u00105\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030 2\u0006\u00104\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010ER\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010GR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010G¨\u0006J"}, d2 = {"Lgo3/c0;", "", "Lgo3/c0$a;", "Lgo3/c0$b;", "Lq34/p1;", "loadCachedAddedDocumentsInfoUC", "Lbo3/a;", "verificationContainersInteractor", "Lgo3/z;", "getScopeByDocumentTypeUseCase", "Lgo3/r;", "getListVerificationDataUseCase", "Lgo3/j;", "getDocumentTypeByScopeUseCase", "Lco3/i;", "scopeMapper", "Lgo3/b0;", "getSupportedDocumentsUseCase", "Lgo3/a0;", "getSubDocumentUseCase", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lmx/c;", "labelProvider", "<init>", "(Lq34/p1;Lbo3/a;Lgo3/z;Lgo3/r;Lgo3/j;Lco3/i;Lgo3/b0;Lgo3/a0;Lmz3/q;Lmx/c;)V", "Lk34/g;", "document", "", "availableDocuments", "Lwn3/c;", "entryPoint", "Ldx/i;", "Ldx/b;", "l", "(Lk34/g;Ljava/util/List;Lwn3/c;Ltq/e;)Ljava/lang/Object;", "Loq/r;", "Lk34/a0;", "scope", "", "institutionId", "j", "(Lk34/g;Loq/r;Lwn3/c;Ljava/lang/Integer;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "supportedDocuments", "i", "(Lwn3/c;Ljava/util/List;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "type", "g", "(Ljava/util/List;Lrq0/b;)Ldx/i;", "h", "(Lwn3/c;Ltq/e;)Ljava/lang/Object;", "params", "k", "(Lgo3/c0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq34/p1;", "b", "Lbo3/a;", "c", "Lgo3/z;", "d", "Lgo3/r;", "e", "Lgo3/j;", "f", "Lco3/i;", "Lgo3/b0;", "Lgo3/a0;", "Lmz3/q;", "Ldx/b$c;", "Ldx/b$c;", "documentNotFoundError", "invalidScopeError", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1 loadCachedAddedDocumentsInfoUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z getScopeByDocumentTypeUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r getListVerificationDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j getDocumentTypeByScopeUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final co3.i scopeMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b0 getSupportedDocumentsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a0 getSubDocumentUseCase;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business documentNotFoundError;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business invalidScopeError;

    /* JADX INFO: renamed from: go3.c0$b, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001c\u0010\"R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b#\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b'\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"Lgo3/c0$b;", "", "Lk34/g;", "document", "", "Lco3/q;", "verificationData", "availableDocuments", "Loq/r;", "Lk34/a0;", "scope", "Lco3/n;", "subDocument", "subDocumentList", "Leo3/v;", "verificationSelector", "<init>", "(Lk34/g;Ljava/util/List;Ljava/util/List;Loq/r;Lco3/n;Ljava/util/List;Leo3/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/g;", "b", "()Lk34/g;", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "d", "Loq/r;", "()Loq/r;", "e", "Lco3/n;", "()Lco3/n;", "g", "Leo3/v;", "()Leo3/v;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g document;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.q> verificationData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k34.g> availableDocuments;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<k34.a0, k34.a0> scope;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.n> subDocumentList;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerificationSelector verificationSelector;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(k34.g gVar, List<? extends co3.q> list, List<? extends k34.g> list2, oq.r<? extends k34.a0, ? extends k34.a0> rVar, co3.n nVar, List<? extends co3.n> list3, VerificationSelector verificationSelector) {
            this.document = gVar;
            this.verificationData = list;
            this.availableDocuments = list2;
            this.scope = rVar;
            this.subDocument = nVar;
            this.subDocumentList = list3;
            this.verificationSelector = verificationSelector;
        }

        public final List<k34.g> a() {
            return this.availableDocuments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final k34.g getDocument() {
            return this.document;
        }

        public final oq.r<k34.a0, k34.a0> c() {
            return this.scope;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public final List<co3.n> e() {
            return this.subDocumentList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.document, result.document) && fr.t.c(this.verificationData, result.verificationData) && fr.t.c(this.availableDocuments, result.availableDocuments) && fr.t.c(this.scope, result.scope) && fr.t.c(this.subDocument, result.subDocument) && fr.t.c(this.subDocumentList, result.subDocumentList) && fr.t.c(this.verificationSelector, result.verificationSelector);
        }

        public final List<co3.q> f() {
            return this.verificationData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final VerificationSelector getVerificationSelector() {
            return this.verificationSelector;
        }

        public int hashCode() {
            int iHashCode = ((((((this.document.hashCode() * 31) + this.verificationData.hashCode()) * 31) + this.availableDocuments.hashCode()) * 31) + this.scope.hashCode()) * 31;
            co3.n nVar = this.subDocument;
            int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
            List<co3.n> list = this.subDocumentList;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            VerificationSelector verificationSelector = this.verificationSelector;
            return iHashCode3 + (verificationSelector != null ? verificationSelector.hashCode() : 0);
        }

        public String toString() {
            return "Result(document=" + this.document + ", verificationData=" + this.verificationData + ", availableDocuments=" + this.availableDocuments + ", scope=" + this.scope + ", subDocument=" + this.subDocument + ", subDocumentList=" + this.subDocumentList + ", verificationSelector=" + this.verificationSelector + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f75284g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75286j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75284g = obj;
            this.f75286j |= PKIFailureInfo.systemUnavail;
            return c0.this.i(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75289f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75290g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75291h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75292j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f75293k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75294l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f75295m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f75297p;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75295m = obj;
            this.f75297p |= PKIFailureInfo.systemUnavail;
            return c0.this.j(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75301g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75302h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75303j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f75304k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75305l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75306m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75307n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f75308p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75310r;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75308p = obj;
            this.f75310r |= PKIFailureInfo.systemUnavail;
            return c0.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75314g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75315h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75316j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f75317k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f75318l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f75319m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75320n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f75321p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f75322q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75323r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f75324s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75325t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f75326v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f75327w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f75329y;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75327w = obj;
            this.f75329y |= PKIFailureInfo.systemUnavail;
            return c0.this.l(null, null, null, this);
        }
    }

    public c0(p1 p1Var, bo3.a aVar, z zVar, r rVar, j jVar, co3.i iVar, b0 b0Var, a0 a0Var, mz3.q qVar, mx.c cVar) {
        this.loadCachedAddedDocumentsInfoUC = p1Var;
        this.verificationContainersInteractor = aVar;
        this.getScopeByDocumentTypeUseCase = zVar;
        this.getListVerificationDataUseCase = rVar;
        this.getDocumentTypeByScopeUseCase = jVar;
        this.scopeMapper = iVar;
        this.getSupportedDocumentsUseCase = b0Var;
        this.getSubDocumentUseCase = a0Var;
        this.getDocumentDownloadStatusUseCase = qVar;
        this.documentNotFoundError = new dx.b.Business(co3.a.DOCUMENT_NOT_FOUND, null, cVar.c(un3.b.M), cVar.c(un3.b.N), null, cVar.c(un3.b.f199406d), null, 82, null);
        this.invalidScopeError = new dx.b.Business(co3.a.INVALID_SCOPE, null, cVar.c(un3.b.f199443k1), null, null, cVar.c(un3.b.f199406d), null, 90, null);
    }

    private final dx.i<dx.b, k34.g> g(List<? extends k34.g> availableDocuments, rq0.b type) {
        Object next;
        Iterator<T> it = availableDocuments.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((k34.g) next).getType(), type));
        k34.g gVar = (k34.g) next;
        return gVar != null ? new dx.i.Right(gVar) : new dx.i.Left(this.documentNotFoundError);
    }

    private final Object h(wn3.c cVar, tq.e<? super rq0.b> eVar) {
        return this.getDocumentTypeByScopeUseCase.d(new j.Params(this.scopeMapper.a(((wn3.c.b.Wru) cVar).getLicenceType())), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f6, code lost:
    
        if (r9 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0125, code lost:
    
        if (r9 == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(wn3.c r6, java.util.List<? extends k34.g> r7, java.util.List<? extends rq0.b> r8, tq.e<? super dx.i<? extends dx.b, ? extends k34.g>> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.c0.i(wn3.c, java.util.List, java.util.List, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j(k34.g gVar, oq.r<? extends k34.a0, ? extends k34.a0> rVar, wn3.c cVar, Integer num, tq.e<? super dx.i<? extends dx.b, Result>> eVar) throws Throwable {
        d dVar;
        k34.g gVar2;
        oq.r<? extends k34.a0, ? extends k34.a0> rVar2;
        wn3.c cVar2;
        Integer num2;
        a0.Result bVar;
        k34.g gVar3;
        oq.r<? extends k34.a0, ? extends k34.a0> rVar3;
        dx.i iVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f75297p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f75297p = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objD = dVar.f75295m;
        Object objE = uq.b.e();
        int i16 = dVar.f75297p;
        if (i16 == 0) {
            oq.u.b(objD);
            a0 a0Var = this.getSubDocumentUseCase;
            a0.Params aVar = new a0.Params(gVar.getType(), null);
            gVar2 = gVar;
            dVar.f75287d = gVar2;
            rVar2 = rVar;
            dVar.f75288e = rVar2;
            dVar.f75289f = cVar;
            dVar.f75290g = num;
            dVar.f75297p = 1;
            objD = a0Var.d(aVar, dVar);
            if (objD != objE) {
                cVar2 = cVar;
                num2 = num;
            }
            return objE;
        }
        if (i16 == 1) {
            Integer num3 = (Integer) dVar.f75290g;
            wn3.c cVar3 = (wn3.c) dVar.f75289f;
            oq.r<? extends k34.a0, ? extends k34.a0> rVar4 = (oq.r) dVar.f75288e;
            k34.g gVar4 = (k34.g) dVar.f75287d;
            oq.u.b(objD);
            rVar2 = rVar4;
            gVar2 = gVar4;
            num2 = num3;
            cVar2 = cVar3;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.Result bVar2 = (a0.Result) dVar.f75292j;
            oq.r<? extends k34.a0, ? extends k34.a0> rVar5 = (oq.r) dVar.f75288e;
            k34.g gVar5 = (k34.g) dVar.f75287d;
            oq.u.b(objD);
            rVar3 = rVar5;
            bVar = bVar2;
            gVar3 = gVar5;
        }
        iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new Result(gVar3, (List) ((dx.i.Right) iVar).b(), pq.v.n(), rVar3, bVar.getSubDocument(), bVar.b(), null));
        }
        throw new oq.p();
        dx.i iVar2 = (dx.i) objD;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        bVar = (a0.Result) ((dx.i.Right) iVar2).b();
        r rVar6 = this.getListVerificationDataUseCase;
        r.Params aVar2 = new r.Params(rVar2.c(), num2, false, bVar.getSubDocument(), cVar2, 4, null);
        dVar.f75287d = gVar2;
        dVar.f75288e = rVar2;
        dVar.f75289f = vq.j.a(cVar2);
        dVar.f75290g = vq.j.a(num2);
        dVar.f75291h = vq.j.a(iVar2);
        dVar.f75292j = bVar;
        dVar.f75293k = 0;
        dVar.f75294l = 0;
        dVar.f75297p = 2;
        objD = rVar6.e(aVar2, dVar);
        if (objD != objE) {
            gVar3 = gVar2;
            rVar3 = rVar2;
            iVar = (dx.i) objD;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(new Result(gVar3, (List) ((dx.i.Right) iVar).b(), pq.v.n(), rVar3, bVar.getSubDocument(), bVar.b(), null));
            }
            throw new oq.p();
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0142 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0143  */
    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:43:0x0167  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:55:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0220  */
    /* JADX WARN: Code duplicated, block: B:61:0x022b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x022c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0230  */
    /* JADX WARN: Code duplicated, block: B:66:0x0253  */
    /* JADX WARN: Code duplicated, block: B:68:0x0259  */
    /* JADX WARN: Code duplicated, block: B:70:0x0270  */
    /* JADX WARN: Code duplicated, block: B:72:0x0276  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(k34.g gVar, List<? extends k34.g> list, wn3.c cVar, tq.e<? super dx.i<? extends dx.b, Result>> eVar) throws Throwable {
        f fVar;
        k34.g gVar2;
        List<? extends k34.g> list2;
        wn3.c cVar2;
        dx.i iVar;
        k34.g gVar3;
        int i15;
        List<? extends k34.g> list3;
        oq.r rVar;
        int i16;
        wn3.c cVar3;
        dx.i iVar2;
        a0.Result bVar;
        List<? extends k34.g> list4;
        k34.g gVar4;
        oq.r rVar2;
        List<? extends k34.g> list5;
        dx.i iVar3;
        int i17;
        int i18;
        k34.g gVar5;
        a0.Result bVar2;
        wn3.c cVar4;
        dx.i iVar4;
        int i19;
        int i25;
        dx.i iVar5;
        List list6;
        rq0.b type;
        dx.i iVar6;
        a0.Result bVar3;
        k34.g gVar6;
        List<? extends k34.g> list7;
        oq.r rVar3;
        List list8;
        dx.i iVar7;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i26 = fVar.f75329y;
            if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f75329y = i26 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objD = fVar.f75327w;
        Object objE = uq.b.e();
        int i27 = fVar.f75329y;
        if (i27 == 0) {
            oq.u.b(objD);
            z zVar = this.getScopeByDocumentTypeUseCase;
            z.Params aVar = new z.Params(gVar.getType());
            gVar2 = gVar;
            fVar.f75311d = gVar2;
            list2 = list;
            fVar.f75312e = list2;
            cVar2 = cVar;
            fVar.f75313f = cVar2;
            fVar.f75329y = 1;
            objD = zVar.d(aVar, fVar);
            if (objD != objE) {
            }
            return objE;
        }
        if (i27 == 1) {
            wn3.c cVar5 = (wn3.c) fVar.f75313f;
            List<? extends k34.g> list9 = (List) fVar.f75312e;
            k34.g gVar7 = (k34.g) fVar.f75311d;
            oq.u.b(objD);
            list2 = list9;
            gVar2 = gVar7;
            cVar2 = cVar5;
        } else {
            if (i27 == 2) {
                i16 = fVar.f75322q;
                i15 = fVar.f75321p;
                rVar = (oq.r) fVar.f75315h;
                dx.i iVar8 = (dx.i) fVar.f75314g;
                cVar2 = (wn3.c) fVar.f75313f;
                list3 = (List) fVar.f75312e;
                gVar3 = (k34.g) fVar.f75311d;
                oq.u.b(objD);
                iVar = iVar8;
                cVar3 = cVar2;
                iVar2 = (dx.i) objD;
                if (iVar2 instanceof dx.i.Left) {
                    return iVar2;
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                bVar = (a0.Result) ((dx.i.Right) iVar2).b();
                r rVar4 = this.getListVerificationDataUseCase;
                k34.a0 a0Var = (k34.a0) rVar.c();
                co3.n nVarA = bVar.getSubDocument();
                list4 = list3;
                gVar4 = gVar3;
                r.Params aVar2 = new r.Params(a0Var, null, nVarA == null && nVarA.getIsOwner(), bVar.getSubDocument(), cVar3);
                fVar.f75311d = gVar4;
                fVar.f75312e = list4;
                fVar.f75313f = vq.j.a(cVar3);
                fVar.f75314g = vq.j.a(iVar);
                fVar.f75315h = rVar;
                fVar.f75316j = vq.j.a(iVar2);
                fVar.f75317k = bVar;
                fVar.f75321p = i15;
                fVar.f75322q = i16;
                fVar.f75323r = 0;
                fVar.f75324s = 0;
                fVar.f75329y = 3;
                objD = rVar4.e(aVar2, fVar);
                if (objD != objE) {
                    rVar2 = rVar;
                    list5 = list4;
                    iVar3 = iVar2;
                    i17 = i16;
                    i18 = i15;
                    gVar5 = gVar4;
                    bVar2 = bVar;
                    cVar4 = cVar3;
                    iVar4 = iVar;
                    i19 = 0;
                    i25 = 0;
                    iVar5 = (dx.i) objD;
                    if (iVar5 instanceof dx.i.Left) {
                        return iVar5;
                    }
                    if (!(iVar5 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    list6 = (List) ((dx.i.Right) iVar5).b();
                    type = gVar5.getType();
                    iVar6 = iVar3;
                    if (!(type instanceof rq0.b.c)) {
                        a0.Result bVar4 = bVar2;
                        return new dx.i.Right(new Result(gVar5, list6, list5, rVar2, bVar4.getSubDocument(), bVar4.b(), null));
                    }
                    fVar.f75311d = gVar5;
                    fVar.f75312e = list5;
                    fVar.f75313f = vq.j.a(cVar4);
                    fVar.f75314g = vq.j.a(iVar4);
                    fVar.f75315h = rVar2;
                    fVar.f75316j = vq.j.a(iVar6);
                    fVar.f75317k = bVar2;
                    fVar.f75318l = vq.j.a(iVar5);
                    fVar.f75319m = list6;
                    fVar.f75320n = vq.j.a(type);
                    fVar.f75321p = i18;
                    fVar.f75322q = i17;
                    fVar.f75323r = i25;
                    fVar.f75324s = i19;
                    fVar.f75325t = 0;
                    fVar.f75326v = 0;
                    fVar.f75329y = 4;
                    objD = this.verificationContainersInteractor.s((rq0.b.c) type, fVar);
                    if (objD != objE) {
                        bVar3 = bVar2;
                        gVar6 = gVar5;
                        list7 = list5;
                        rVar3 = rVar2;
                        list8 = list6;
                    }
                }
                return objE;
            }
            if (i27 == 3) {
                int i28 = fVar.f75324s;
                int i29 = fVar.f75323r;
                int i35 = fVar.f75322q;
                int i36 = fVar.f75321p;
                a0.Result bVar5 = (a0.Result) fVar.f75317k;
                dx.i iVar9 = (dx.i) fVar.f75316j;
                oq.r rVar5 = (oq.r) fVar.f75315h;
                iVar4 = (dx.i) fVar.f75314g;
                cVar4 = (wn3.c) fVar.f75313f;
                List<? extends k34.g> list10 = (List) fVar.f75312e;
                gVar5 = (k34.g) fVar.f75311d;
                oq.u.b(objD);
                i18 = i36;
                rVar2 = rVar5;
                iVar3 = iVar9;
                i25 = i29;
                i19 = i28;
                bVar2 = bVar5;
                i17 = i35;
                list5 = list10;
                iVar5 = (dx.i) objD;
                if (iVar5 instanceof dx.i.Left) {
                    return iVar5;
                }
                if (!(iVar5 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                list6 = (List) ((dx.i.Right) iVar5).b();
                type = gVar5.getType();
                iVar6 = iVar3;
                if (!(type instanceof rq0.b.c)) {
                    a0.Result bVar6 = bVar2;
                    return new dx.i.Right(new Result(gVar5, list6, list5, rVar2, bVar6.getSubDocument(), bVar6.b(), null));
                }
                fVar.f75311d = gVar5;
                fVar.f75312e = list5;
                fVar.f75313f = vq.j.a(cVar4);
                fVar.f75314g = vq.j.a(iVar4);
                fVar.f75315h = rVar2;
                fVar.f75316j = vq.j.a(iVar6);
                fVar.f75317k = bVar2;
                fVar.f75318l = vq.j.a(iVar5);
                fVar.f75319m = list6;
                fVar.f75320n = vq.j.a(type);
                fVar.f75321p = i18;
                fVar.f75322q = i17;
                fVar.f75323r = i25;
                fVar.f75324s = i19;
                fVar.f75325t = 0;
                fVar.f75326v = 0;
                fVar.f75329y = 4;
                objD = this.verificationContainersInteractor.s((rq0.b.c) type, fVar);
                if (objD != objE) {
                    bVar3 = bVar2;
                    gVar6 = gVar5;
                    list7 = list5;
                    rVar3 = rVar2;
                    list8 = list6;
                }
                return objE;
            }
            if (i27 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list11 = (List) fVar.f75319m;
            a0.Result bVar7 = (a0.Result) fVar.f75317k;
            oq.r rVar6 = (oq.r) fVar.f75315h;
            List<? extends k34.g> list12 = (List) fVar.f75312e;
            k34.g gVar8 = (k34.g) fVar.f75311d;
            oq.u.b(objD);
            rVar3 = rVar6;
            list7 = list12;
            bVar3 = bVar7;
            list8 = list11;
            gVar6 = gVar8;
        }
        iVar7 = (dx.i) objD;
        if (iVar7 instanceof dx.i.Left) {
            return iVar7;
        }
        if (iVar7 instanceof dx.i.Right) {
            return new dx.i.Right(new Result(gVar6, list8, list7, rVar3, bVar3.getSubDocument(), bVar3.b(), ((MultiDynamicDocumentData) ((dx.i.Right) iVar7).b()).getMultiDocumentSchema().getVerificationSelector()));
        }
        throw new oq.p();
        dx.i iVar10 = (dx.i) objD;
        if (iVar10 instanceof dx.i.Left) {
            return iVar10;
        }
        if (!(iVar10 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        oq.r rVar7 = (oq.r) ((dx.i.Right) iVar10).b();
        a0 a0Var2 = this.getSubDocumentUseCase;
        a0.Params aVar3 = new a0.Params(gVar2.getType(), cVar2);
        fVar.f75311d = gVar2;
        fVar.f75312e = list2;
        fVar.f75313f = cVar2;
        fVar.f75314g = vq.j.a(iVar10);
        fVar.f75315h = rVar7;
        fVar.f75321p = 0;
        fVar.f75322q = 0;
        fVar.f75329y = 2;
        Object objD2 = a0Var2.d(aVar3, fVar);
        if (objD2 != objE) {
            iVar = iVar10;
            gVar3 = gVar2;
            objD = objD2;
            i15 = 0;
            list3 = list2;
            rVar = rVar7;
            i16 = 0;
            cVar3 = cVar2;
            iVar2 = (dx.i) objD;
            if (iVar2 instanceof dx.i.Left) {
                return iVar2;
            }
            if (iVar2 instanceof dx.i.Right) {
                throw new oq.p();
            }
            bVar = (a0.Result) ((dx.i.Right) iVar2).b();
            r rVar8 = this.getListVerificationDataUseCase;
            k34.a0 a0Var3 = (k34.a0) rVar.c();
            co3.n nVarA2 = bVar.getSubDocument();
            list4 = list3;
            gVar4 = gVar3;
            r.Params aVar4 = new r.Params(a0Var3, null, nVarA2 == null && nVarA2.getIsOwner(), bVar.getSubDocument(), cVar3);
            fVar.f75311d = gVar4;
            fVar.f75312e = list4;
            fVar.f75313f = vq.j.a(cVar3);
            fVar.f75314g = vq.j.a(iVar);
            fVar.f75315h = rVar;
            fVar.f75316j = vq.j.a(iVar2);
            fVar.f75317k = bVar;
            fVar.f75321p = i15;
            fVar.f75322q = i16;
            fVar.f75323r = 0;
            fVar.f75324s = 0;
            fVar.f75329y = 3;
            objD = rVar8.e(aVar4, fVar);
            if (objD != objE) {
                rVar2 = rVar;
                list5 = list4;
                iVar3 = iVar2;
                i17 = i16;
                i18 = i15;
                gVar5 = gVar4;
                bVar2 = bVar;
                cVar4 = cVar3;
                iVar4 = iVar;
                i19 = 0;
                i25 = 0;
                iVar5 = (dx.i) objD;
                if (iVar5 instanceof dx.i.Left) {
                    return iVar5;
                }
                if (!(iVar5 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                list6 = (List) ((dx.i.Right) iVar5).b();
                type = gVar5.getType();
                iVar6 = iVar3;
                if (!(type instanceof rq0.b.c)) {
                    a0.Result bVar8 = bVar2;
                    return new dx.i.Right(new Result(gVar5, list6, list5, rVar2, bVar8.getSubDocument(), bVar8.b(), null));
                }
                fVar.f75311d = gVar5;
                fVar.f75312e = list5;
                fVar.f75313f = vq.j.a(cVar4);
                fVar.f75314g = vq.j.a(iVar4);
                fVar.f75315h = rVar2;
                fVar.f75316j = vq.j.a(iVar6);
                fVar.f75317k = bVar2;
                fVar.f75318l = vq.j.a(iVar5);
                fVar.f75319m = list6;
                fVar.f75320n = vq.j.a(type);
                fVar.f75321p = i18;
                fVar.f75322q = i17;
                fVar.f75323r = i25;
                fVar.f75324s = i19;
                fVar.f75325t = 0;
                fVar.f75326v = 0;
                fVar.f75329y = 4;
                objD = this.verificationContainersInteractor.s((rq0.b.c) type, fVar);
                if (objD != objE) {
                    bVar3 = bVar2;
                    gVar6 = gVar5;
                    list7 = list5;
                    rVar3 = rVar2;
                    list8 = list6;
                    iVar7 = (dx.i) objD;
                    if (iVar7 instanceof dx.i.Left) {
                        return iVar7;
                    }
                    if (iVar7 instanceof dx.i.Right) {
                        return new dx.i.Right(new Result(gVar6, list8, list7, rVar3, bVar3.getSubDocument(), bVar3.b(), ((MultiDynamicDocumentData) ((dx.i.Right) iVar7).b()).getMultiDocumentSchema().getVerificationSelector()));
                    }
                    throw new oq.p();
                }
            }
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02da  */
    /* JADX WARN: Code duplicated, block: B:110:0x0307  */
    /* JADX WARN: Code duplicated, block: B:113:0x0315 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x0316  */
    /* JADX WARN: Code duplicated, block: B:116:0x031a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0359 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x035a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0161  */
    /* JADX WARN: Code duplicated, block: B:48:0x0181 A[LOOP:3: B:43:0x015b->B:48:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x018d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:89:0x0273  */
    /* JADX WARN: Code duplicated, block: B:91:0x0279  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0139 -> B:33:0x013d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:48:0x0181
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object k(go3.c0.Params r17, tq.e<? super dx.i<? extends dx.b, go3.c0.Result>> r18) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.c0.k(go3.c0$a, tq.e):java.lang.Object");
    }

    /* JADX INFO: renamed from: go3.c0$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b%\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\"\u0010/¨\u00060"}, d2 = {"Lgo3/c0$a;", "Lgz/b$a;", "Lrq0/b;", "documentType", "Lk34/g;", "document", "Lwn3/c;", "entryPoint", "", "isInstitution", "isUserChangingDocument", "Loq/r;", "Lk34/a0;", "scope", "", "institutionId", "<init>", "(Lrq0/b;Lk34/g;Lwn3/c;ZZLoq/r;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "getDocumentType", "()Lrq0/b;", "b", "Lk34/g;", "()Lk34/g;", "c", "Lwn3/c;", "()Lwn3/c;", "d", "Z", "f", "()Z", "e", "h", "Loq/r;", "()Loq/r;", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g document;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInstitution;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUserChangingDocument;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<k34.a0, k34.a0> scope;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer institutionId;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(rq0.b bVar, k34.g gVar, wn3.c cVar, boolean z15, boolean z16, oq.r<? extends k34.a0, ? extends k34.a0> rVar, Integer num) {
            this.documentType = bVar;
            this.document = gVar;
            this.entryPoint = cVar;
            this.isInstitution = z15;
            this.isUserChangingDocument = z16;
            this.scope = rVar;
            this.institutionId = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k34.g getDocument() {
            return this.document;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getInstitutionId() {
            return this.institutionId;
        }

        public final oq.r<k34.a0, k34.a0> d() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.documentType, params.documentType) && fr.t.c(this.document, params.document) && fr.t.c(this.entryPoint, params.entryPoint) && this.isInstitution == params.isInstitution && this.isUserChangingDocument == params.isUserChangingDocument && fr.t.c(this.scope, params.scope) && fr.t.c(this.institutionId, params.institutionId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsInstitution() {
            return this.isInstitution;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsUserChangingDocument() {
            return this.isUserChangingDocument;
        }

        public int hashCode() {
            rq0.b bVar = this.documentType;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            k34.g gVar = this.document;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            wn3.c cVar = this.entryPoint;
            int iHashCode3 = (((((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isInstitution)) * 31) + Boolean.hashCode(this.isUserChangingDocument)) * 31;
            oq.r<k34.a0, k34.a0> rVar = this.scope;
            int iHashCode4 = (iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            Integer num = this.institutionId;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Params(documentType=" + this.documentType + ", document=" + this.document + ", entryPoint=" + this.entryPoint + ", isInstitution=" + this.isInstitution + ", isUserChangingDocument=" + this.isUserChangingDocument + ", scope=" + this.scope + ", institutionId=" + this.institutionId + ')';
        }

        public /* synthetic */ Params(rq0.b bVar, k34.g gVar, wn3.c cVar, boolean z15, boolean z16, oq.r rVar, Integer num, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : bVar, (i15 & 2) != 0 ? null : gVar, (i15 & 4) != 0 ? null : cVar, z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? null : rVar, num);
        }
    }
}
