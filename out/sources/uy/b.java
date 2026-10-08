package uy;

import er.l;
import java.util.Collection;
import p071kotlin.Metadata;
import vy.Coordinates;
import vy.DistanceDegree;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Luy/b;", "", "Lvy/g;", "distance", "Lvy/h;", "a", "(D)Lvy/h;", "T", "Lvy/c;", "distanceTo", "", "dataToOrder", "Lkotlin/Function1;", "transformToCoordinates", "b", "(Lvy/c;Ljava/util/Collection;Ler/l;)Ljava/util/Collection;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    DistanceDegree a(double distance);

    <T> Collection<T> b(Coordinates distanceTo, Collection<? extends T> dataToOrder, l<? super T, Coordinates> transformToCoordinates);
}
