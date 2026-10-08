package t5;

import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u00002\u00020\u0001B?\b\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006&"}, d2 = {"Lt5/c;", "", "", "id", "", "alias", "", "", "manuallyTestedFingerprints", "Lkotlin/Function0;", "", "precondition", "<init>", "(JLjava/lang/Integer;Ljava/util/Set;Ler/a;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "J", "getId", "()J", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "Ler/a;", "e", "()Ler/a;", "Ljava/lang/String;", "getUrl", "url", "core-backported-fixes"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer alias;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<String> manuallyTestedFingerprints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<Boolean> precondition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String url;

    public c(long j15, Integer num, Set<String> set, er.a<Boolean> aVar) {
        this.id = j15;
        this.alias = num;
        this.manuallyTestedFingerprints = set;
        this.precondition = aVar;
        this.url = "https://issuetracker.google.com/issues/" + j15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        return true;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getAlias() {
        return this.alias;
    }

    public final Set<String> d() {
        return this.manuallyTestedFingerprints;
    }

    public final er.a<Boolean> e() {
        return this.precondition;
    }

    public boolean equals(Object other) {
        return (other instanceof c) && this.id == ((c) other).id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    public String toString() {
        if (this.alias == null) {
            return this.id + " without alias";
        }
        return this.id + " with alias " + this.alias.intValue();
    }

    public /* synthetic */ c(long j15, Integer num, Set set, er.a aVar, int i15, fr.k kVar) {
        this(j15, num, (i15 & 4) != 0 ? e1.e() : set, (i15 & 8) != 0 ? new er.a() { // from class: t5.b
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(c.b());
            }
        } : aVar);
    }
}
