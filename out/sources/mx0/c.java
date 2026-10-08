package mx0;

import p071kotlin.Metadata;
import zw0.EIdActivationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\u0006\nB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lmx0/c;", "", "Lrq0/b;", "mainDocumentType", "<init>", "(Lrq0/b;)V", "a", "Lrq0/b;", "()Lrq0/b;", "b", "c", "Lmx0/c$a;", "Lmx0/c$b;", "Lmx0/c$c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rq0.b mainDocumentType;

    /* JADX INFO: renamed from: mx0.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmx0/c$a;", "Lmx0/c;", "Lzw0/b;", "activationData", "Lrq0/b;", "mainDocumentType", "<init>", "(Lzw0/b;Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lzw0/b;", "()Lzw0/b;", "c", "Lrq0/b;", "a", "()Lrq0/b;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EIdActivation extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EIdActivationData activationData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b mainDocumentType;

        public EIdActivation(EIdActivationData eIdActivationData, rq0.b bVar) {
            super(bVar, null);
            this.activationData = eIdActivationData;
            this.mainDocumentType = bVar;
        }

        @Override // mx0.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b getMainDocumentType() {
            return this.mainDocumentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EIdActivationData getActivationData() {
            return this.activationData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EIdActivation)) {
                return false;
            }
            EIdActivation eIdActivation = (EIdActivation) other;
            return fr.t.c(this.activationData, eIdActivation.activationData) && fr.t.c(this.mainDocumentType, eIdActivation.mainDocumentType);
        }

        public int hashCode() {
            EIdActivationData eIdActivationData = this.activationData;
            return ((eIdActivationData == null ? 0 : eIdActivationData.hashCode()) * 31) + this.mainDocumentType.hashCode();
        }

        public String toString() {
            return "EIdActivation(activationData=" + this.activationData + ", mainDocumentType=" + this.mainDocumentType + ')';
        }
    }

    /* JADX INFO: renamed from: mx0.c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmx0/c$b;", "Lmx0/c;", "Liy/b0;", "activationContent", "Lrq0/b;", "mainDocumentType", "<init>", "(Liy/b0;Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Liy/b0;", "()Liy/b0;", "c", "Lrq0/b;", "a", "()Lrq0/b;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullActivation extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 activationContent;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b mainDocumentType;

        public FullActivation(iy.b0 b0Var, rq0.b bVar) {
            super(bVar, null);
            this.activationContent = b0Var;
            this.mainDocumentType = bVar;
        }

        @Override // mx0.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b getMainDocumentType() {
            return this.mainDocumentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getActivationContent() {
            return this.activationContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FullActivation)) {
                return false;
            }
            FullActivation fullActivation = (FullActivation) other;
            return fr.t.c(this.activationContent, fullActivation.activationContent) && fr.t.c(this.mainDocumentType, fullActivation.mainDocumentType);
        }

        public int hashCode() {
            return (this.activationContent.hashCode() * 31) + this.mainDocumentType.hashCode();
        }

        public String toString() {
            return "FullActivation(activationContent=" + this.activationContent + ", mainDocumentType=" + this.mainDocumentType + ')';
        }
    }

    /* JADX INFO: renamed from: mx0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmx0/c$c;", "Lmx0/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3201c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C3201c f128983b = new C3201c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f128984c = 8;

        /* JADX WARN: Multi-variable type inference failed */
        private C3201c() {
            super(null, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3201c);
        }

        public int hashCode() {
            return 1912954444;
        }

        public String toString() {
            return "MainDocumentDownload";
        }
    }

    public /* synthetic */ c(rq0.b bVar, fr.k kVar) {
        this(bVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public rq0.b getMainDocumentType() {
        return this.mainDocumentType;
    }

    private c(rq0.b bVar) {
        this.mainDocumentType = bVar;
    }
}
