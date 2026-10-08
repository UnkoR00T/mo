package uc4;

import d72.HydroWarning;
import d72.HydroWarningArea;
import d72.HydroWarningLine;
import d72.HydroWarningMultiPolygon;
import d72.HydroWarningPoint;
import d72.HydroWarningPolygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import xk0.BEHydroWarning;
import xk0.BEHydroWarningArea;
import xk0.BEHydroWarningLine;
import xk0.BEHydroWarningMultiPolygon;
import xk0.BEHydroWarningPoint;
import xk0.BEHydroWarningPolygon;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxk0/e;", "Ld72/f;", "g", "(Lxk0/e;)Ld72/f;", "Lxk0/c;", "Ld72/d;", "e", "(Lxk0/c;)Ld72/d;", "Lxk0/f;", "Ld72/g;", "h", "(Lxk0/f;)Ld72/g;", "Lxk0/d;", "Ld72/e;", "f", "(Lxk0/d;)Ld72/e;", "Lxk0/b;", "Ld72/c;", "d", "(Lxk0/b;)Ld72/c;", "Lxk0/a;", "Ld72/b;", "c", "(Lxk0/a;)Ld72/b;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HydroWarning c(BEHydroWarning bEHydroWarning) {
        return new HydroWarning(bEHydroWarning.getDateFrom(), bEHydroWarning.getPublishedAt(), bEHydroWarning.getArea(), bEHydroWarning.getComment(), bEHydroWarning.getDateTo(), bEHydroWarning.getDescription(), bEHydroWarning.getEventType(), bEHydroWarning.getLevel(), bEHydroWarning.getNumber(), bEHydroWarning.getOffice(), bEHydroWarning.getProbability(), bEHydroWarning.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HydroWarningArea d(BEHydroWarningArea bEHydroWarningArea) {
        ArrayList arrayList;
        Integer level = bEHydroWarningArea.getLevel();
        List<BEHydroWarningMultiPolygon> listB = bEHydroWarningArea.b();
        if (listB != null) {
            List<BEHydroWarningMultiPolygon> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f((BEHydroWarningMultiPolygon) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new HydroWarningArea(level, arrayList);
    }

    private static final HydroWarningLine e(BEHydroWarningLine bEHydroWarningLine) {
        List<BEHydroWarningPoint> listA = bEHydroWarningLine.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(g((BEHydroWarningPoint) it.next()));
        }
        return new HydroWarningLine(arrayList);
    }

    private static final HydroWarningMultiPolygon f(BEHydroWarningMultiPolygon bEHydroWarningMultiPolygon) {
        String code = bEHydroWarningMultiPolygon.getCode();
        List<BEHydroWarningPolygon> listB = bEHydroWarningMultiPolygon.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(h((BEHydroWarningPolygon) it.next()));
        }
        return new HydroWarningMultiPolygon(code, arrayList);
    }

    private static final HydroWarningPoint g(BEHydroWarningPoint bEHydroWarningPoint) {
        return new HydroWarningPoint(bEHydroWarningPoint.getLat(), bEHydroWarningPoint.getLon());
    }

    private static final HydroWarningPolygon h(BEHydroWarningPolygon bEHydroWarningPolygon) {
        List<BEHydroWarningLine> listA = bEHydroWarningPolygon.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((BEHydroWarningLine) it.next()));
        }
        return new HydroWarningPolygon(arrayList, e(bEHydroWarningPolygon.getOutline()));
    }
}
