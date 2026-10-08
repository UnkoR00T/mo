package fv0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fv0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfv0/a;", "", "", "diplomaUuid", "Lfv0/b;", "diplomaSubtype", "Lfv0/a$a;", "generationStatus", "<init>", "(Ljava/lang/String;Lfv0/b;Lfv0/a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lfv0/b;", "()Lfv0/b;", "c", "Lfv0/a$a;", "()Lfv0/a$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEDiploma {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String diplomaUuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b diplomaSubtype;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC1516a generationStatus;

    /* JADX INFO: renamed from: fv0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lfv0/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC1516a {
        NONE,
        IN_PROGRESS,
        SUCCESS,
        ERROR;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f67609f = wq.b.a(b());
    }

    public BEDiploma(String str, b bVar, EnumC1516a enumC1516a) {
        this.diplomaUuid = str;
        this.diplomaSubtype = bVar;
        this.generationStatus = enumC1516a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getDiplomaSubtype() {
        return this.diplomaSubtype;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDiplomaUuid() {
        return this.diplomaUuid;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC1516a getGenerationStatus() {
        return this.generationStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEDiploma)) {
            return false;
        }
        BEDiploma bEDiploma = (BEDiploma) other;
        return t.c(this.diplomaUuid, bEDiploma.diplomaUuid) && this.diplomaSubtype == bEDiploma.diplomaSubtype && this.generationStatus == bEDiploma.generationStatus;
    }

    public int hashCode() {
        return (((this.diplomaUuid.hashCode() * 31) + this.diplomaSubtype.hashCode()) * 31) + this.generationStatus.hashCode();
    }

    public String toString() {
        return "BEDiploma(diplomaUuid=" + this.diplomaUuid + ", diplomaSubtype=" + this.diplomaSubtype + ", generationStatus=" + this.generationStatus + ")";
    }
}
