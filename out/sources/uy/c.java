package uy;

import dx.i;
import java.util.List;
import p071kotlin.Metadata;
import vy.Address;
import vy.Coordinates;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u00042\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Luy/c;", "", "Lvy/c;", "latLng", "Ldx/i;", "Ldx/b;", "Lvy/a;", "a", "(Lvy/c;)Ldx/i;", "center", "Lvy/g;", "distance", "", "location", "", "b", "(Lvy/c;DLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    i<dx.b, Address> a(Coordinates latLng);

    Object b(Coordinates coordinates, double d15, String str, tq.e<? super i<? extends dx.b, ? extends List<Address>>> eVar);

    Object c(String str, tq.e<? super i<? extends dx.b, ? extends List<Address>>> eVar);
}
