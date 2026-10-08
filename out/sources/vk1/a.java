package vk1;

import fr.t;
import gz.b;
import hz.g;
import iy.b0;
import j14.e;
import j14.h;
import j14.i;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvk1/a;", "Lgz/a;", "Lvk1/a$a;", "", "Lmk1/a;", "Lhz/g;", "Lj14/e;", "isFathersNameValidUseCase", "Lj14/h;", "isMothersMaidenNameValidUseCase", "Lj14/i;", "isMothersNameValidUseCase", "<init>", "(Lj14/e;Lj14/h;Lj14/i;)V", "params", "b", "(Lvk1/a$a;)Ljava/util/Map;", "a", "Lj14/e;", "Lj14/h;", "c", "Lj14/i;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, Map<mk1.a, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e isFathersNameValidUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h isMothersMaidenNameValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i isMothersNameValidUseCase;

    /* JADX INFO: renamed from: vk1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lvk1/a$a;", "Lgz/b$a;", "Liy/b0;", "fathersName", "mothersName", "mothersFamilyName", "<init>", "(Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f207174d = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 fathersName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 mothersName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 mothersFamilyName;

        public Params(b0 b0Var, b0 b0Var2, b0 b0Var3) {
            this.fathersName = b0Var;
            this.mothersName = b0Var2;
            this.mothersFamilyName = b0Var3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getFathersName() {
            return this.fathersName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getMothersFamilyName() {
            return this.mothersFamilyName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getMothersName() {
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
            return t.c(this.fathersName, params.fathersName) && t.c(this.mothersName, params.mothersName) && t.c(this.mothersFamilyName, params.mothersFamilyName);
        }

        public int hashCode() {
            return (((this.fathersName.hashCode() * 31) + this.mothersName.hashCode()) * 31) + this.mothersFamilyName.hashCode();
        }

        public String toString() {
            return "Params(fathersName=" + this.fathersName + ", mothersName=" + this.mothersName + ", mothersFamilyName=" + this.mothersFamilyName + ')';
        }
    }

    public a(e eVar, h hVar, i iVar) {
        this.isFathersNameValidUseCase = eVar;
        this.isMothersMaidenNameValidUseCase = hVar;
        this.isMothersNameValidUseCase = iVar;
    }

    public Map<mk1.a, g> b(Params params) {
        return v0.l(y.a(mk1.a.FATHERS_NAME, this.isFathersNameValidUseCase.a(new e.Params(params.getFathersName()))), y.a(mk1.a.MOTHERS_NAME, this.isMothersNameValidUseCase.a(new i.Params(params.getMothersName()))), y.a(mk1.a.MOTHERS_FAMILY_NAME, this.isMothersMaidenNameValidUseCase.a(new h.Params(params.getMothersFamilyName()))));
    }
}
