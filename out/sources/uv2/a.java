package uv2;

import fr.t;
import gz.b;
import hz.g;
import ix2.m;
import iy.c0;
import j14.e;
import j14.h;
import j14.i;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Luv2/a;", "Lgz/b;", "Luv2/a$a;", "", "Lix2/a;", "Lhz/g;", "Lj14/e;", "isFathersNameValidUseCase", "Lj14/h;", "isMothersMaidenNameValidUseCase", "Lj14/i;", "isMothersNameValidUseCase", "<init>", "(Lj14/e;Lj14/h;Lj14/i;)V", "params", "d", "(Luv2/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj14/e;", "b", "Lj14/h;", "c", "Lj14/i;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b<Params, Map<ix2.a, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e isFathersNameValidUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h isMothersMaidenNameValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i isMothersNameValidUseCase;

    /* JADX INFO: renamed from: uv2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001c"}, d2 = {"Luv2/a$a;", "Lgz/b$a;", "Lix2/m;", "dataRequester", "", "fathersName", "mothersName", "mothersMaidenName", "<init>", "(Lix2/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lix2/m;", "getDataRequester", "()Lix2/m;", "b", "Ljava/lang/String;", "c", "d", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m dataRequester;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fathersName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mothersName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mothersMaidenName;

        public Params(m mVar, String str, String str2, String str3) {
            this.dataRequester = mVar;
            this.fathersName = str;
            this.mothersName = str2;
            this.mothersMaidenName = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFathersName() {
            return this.fathersName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMothersMaidenName() {
            return this.mothersMaidenName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMothersName() {
            return this.mothersName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.dataRequester == params.dataRequester && t.c(this.fathersName, params.fathersName) && t.c(this.mothersName, params.mothersName) && t.c(this.mothersMaidenName, params.mothersMaidenName);
        }

        public int hashCode() {
            return (((((this.dataRequester.hashCode() * 31) + this.fathersName.hashCode()) * 31) + this.mothersName.hashCode()) * 31) + this.mothersMaidenName.hashCode();
        }

        public String toString() {
            return "Params(dataRequester=" + this.dataRequester + ", fathersName=" + this.fathersName + ", mothersName=" + this.mothersName + ", mothersMaidenName=" + this.mothersMaidenName + ')';
        }
    }

    public a(e eVar, h hVar, i iVar) {
        this.isFathersNameValidUseCase = eVar;
        this.isMothersMaidenNameValidUseCase = hVar;
        this.isMothersNameValidUseCase = iVar;
    }

    public Object d(Params params, tq.e<? super Map<ix2.a, ? extends g>> eVar) {
        return v0.l(y.a(ix2.a.FATHERS_NAME, this.isFathersNameValidUseCase.a(new e.Params(c0.g(params.getFathersName())))), y.a(ix2.a.MOTHERS_NAME, this.isMothersNameValidUseCase.a(new i.Params(c0.g(params.getMothersName())))), y.a(ix2.a.MOTHERS_MAIDEN_NAME, this.isMothersMaidenNameValidUseCase.a(new h.Params(c0.g(params.getMothersMaidenName())))));
    }
}
