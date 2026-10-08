package fv0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fv0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfv0/d;", "", "Lfv0/d$a;", "languageCode", "", "Lfv0/a;", "diplomas", "<init>", "(Lfv0/d$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfv0/d$a;", "b", "()Lfv0/d$a;", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEDiplomasByLanguage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a languageCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEDiploma> diplomas;

    /* JADX INFO: renamed from: fv0.d$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lfv0/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        PL,
        EN,
        DE,
        FR,
        ES,
        RU,
        LA;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ wq.a f67631j = wq.b.a(b());
    }

    public BEDiplomasByLanguage(a aVar, List<BEDiploma> list) {
        this.languageCode = aVar;
        this.diplomas = list;
    }

    public final List<BEDiploma> a() {
        return this.diplomas;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getLanguageCode() {
        return this.languageCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEDiplomasByLanguage)) {
            return false;
        }
        BEDiplomasByLanguage bEDiplomasByLanguage = (BEDiplomasByLanguage) other;
        return this.languageCode == bEDiplomasByLanguage.languageCode && t.c(this.diplomas, bEDiplomasByLanguage.diplomas);
    }

    public int hashCode() {
        return (this.languageCode.hashCode() * 31) + this.diplomas.hashCode();
    }

    public String toString() {
        return "BEDiplomasByLanguage(languageCode=" + this.languageCode + ", diplomas=" + this.diplomas + ")";
    }
}
