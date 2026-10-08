package x93;

import dx.i;
import java.util.List;
import p071kotlin.Metadata;
import tq.e;
import vy.Coordinates;
import z93.PlaceDetails;
import z93.PlaceSuggestion;
import z93.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0014\u0010\u000f¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lx93/c;", "", "Lvy/c;", "coordinates", "Ldx/i;", "Ldx/b;", "Lz93/f;", "a", "(Lvy/c;Ltq/e;)Ljava/lang/Object;", "Lz93/e;", "placeId", "Lz93/h;", "sessionToken", "Lz93/d;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "query", "", "Lz93/g;", "b", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    Object a(Coordinates coordinates, e<? super i<? extends dx.b, ? extends f>> eVar);

    Object b(String str, String str2, e<? super i<? extends dx.b, ? extends List<PlaceSuggestion>>> eVar);

    Object c(String str, String str2, e<? super i<? extends dx.b, PlaceDetails>> eVar);
}
