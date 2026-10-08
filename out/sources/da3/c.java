package da3;

import fu.o;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;
import z93.Place;
import z93.PlaceSuggestion;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lda3/c;", "Lda3/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Lvy/c;", "e", "(Lvy/c;)Ljava/lang/String;", "Lz93/g;", "hint", "a", "(Lz93/g;)Ljava/lang/String;", "Lz93/c;", "place", "b", "(Lz93/c;)Ljava/lang/String;", "Lmx/c;", "Lfu/o;", "Loq/k;", "f", "()Lfu/o;", "regex", "c", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements da3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f40589c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40590d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k regex = l.a(new er.a() { // from class: da3.b
        @Override // er.a
        public final Object a() {
            return c.g();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lda3/c$a;", "", "<init>", "()V", "", "PATTERN", "Ljava/lang/String;", "COORDINATES_SEPARATOR", "NEW_LINE_SEPARATOR", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final String d(String str) {
        return f().h(str, "\n");
    }

    private final String e(Coordinates coordinates) {
        return v.v0(v.q(this.labelProvider.c(r93.a.D0).getText(), coordinates.a(", ")), "\n", null, null, 0, null, null, 62, null);
    }

    private final o f() {
        return (o) this.regex.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o g() {
        return new o("\\s*,\\s*");
    }

    @Override // da3.a
    public String a(PlaceSuggestion hint) {
        return d(hint.getFullAddress());
    }

    @Override // da3.a
    public String b(Place place) {
        String strD;
        String fullAddress = place.getFullAddress();
        return (fullAddress == null || (strD = d(fullAddress)) == null) ? e(place.getCoordinates()) : strD;
    }
}
