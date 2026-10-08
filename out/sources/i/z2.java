package i;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.StreamGraph;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lh/s$b;", "graphConfig", "Ll/x;", "streamGraph", "", "Lh/q1;", "Landroid/view/Surface;", "surfaces", "Li/m3;", "b", "(Lh/s$b;Ll/x;Ljava/util/Map;)Li/m3;", "Lh/c1;", "c", "(Ljava/util/Map;Ll/x;)Ljava/util/Map;", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z2 {
    public static final OutputConfigurations b(h.s.b bVar, StreamGraph streamGraph, Map<h.q1, ? extends Surface> map) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<h.q1, n.m> entry : streamGraph.N().entrySet()) {
            int value = entry.getKey().getValue();
            n.m value2 = entry.getValue();
            h.c0 c0VarH = streamGraph.h(value);
            if (c0VarH == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List<h.e1> listB = c0VarH.b();
            if (listB.size() != 1) {
                if (Build.VERSION.SDK_INT < 31) {
                    throw new IllegalArgumentException("Cannot configure multiple outputs pre-S!");
                }
                Object objC0 = value2.c0(fr.q0.c(n.e.class));
                if (objC0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List<OutputConfiguration> listS1 = ((n.e) objC0).s1();
                if (listS1.size() != listB.size()) {
                    throw new IllegalStateException("Check failed.");
                }
                int size = listB.size();
                for (int i15 = 0; i15 < size; i15++) {
                    h.e1 e1Var = listB.get(i15);
                    OutputConfiguration outputConfiguration = listS1.get(i15);
                    StreamGraph.c cVar = streamGraph.O().get(e1Var);
                    if (cVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    StreamGraph.c cVar2 = cVar;
                    if (cVar2.getExternalOutputConfig() != null) {
                        throw new IllegalStateException("External OutputConfiguration shouldn't be set in multi-output streams configured with ImageSource.Config");
                    }
                    linkedHashMap3.put(cVar2, outputConfiguration);
                }
            }
        }
        for (h.c0 c0Var : streamGraph.G()) {
            List<h.e1> listB2 = c0Var.b();
            if (listB2.size() == 1) {
                Surface surface = map.get(h.q1.a(c0Var.getId()));
                if (surface != null) {
                    linkedHashMap2.put(h.c1.a(((h.e1) pq.v.P0(listB2)).getId()), surface);
                }
            } else {
                for (h.e1 e1Var2 : listB2) {
                    StreamGraph.c cVar3 = streamGraph.O().get(e1Var2);
                    if (cVar3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    StreamGraph.c cVar4 = cVar3;
                    OutputConfiguration externalOutputConfig = cVar4.getExternalOutputConfig();
                    if (externalOutputConfig == null) {
                        externalOutputConfig = (OutputConfiguration) linkedHashMap3.get(cVar4);
                    }
                    Surface surface2 = externalOutputConfig != null ? externalOutputConfig.getSurface() : map.get(h.q1.a(c0Var.getId()));
                    if (surface2 != null) {
                        linkedHashMap2.put(h.c1.a(e1Var2.getId()), surface2);
                    }
                }
            }
        }
        l3 l3Var = null;
        for (StreamGraph.c cVar5 : streamGraph.V()) {
            List<h.c0> listN = cVar5.n();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listN.iterator();
            while (it.hasNext()) {
                Surface surface3 = map.get(h.q1.a(((h.c0) it.next()).getId()));
                if (surface3 != null) {
                    arrayList2.add(surface3);
                }
            }
            OutputConfiguration externalOutputConfig2 = cVar5.getExternalOutputConfig();
            if (externalOutputConfig2 == null) {
                externalOutputConfig2 = (OutputConfiguration) linkedHashMap3.get(cVar5);
            }
            OutputConfiguration outputConfiguration2 = externalOutputConfig2;
            if (outputConfiguration2 != null) {
                if (arrayList2.size() != cVar5.n().size()) {
                    List<h.c0> listN2 = cVar5.n();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : listN2) {
                        if (!map.containsKey(h.q1.a(((h.c0) obj).getId()))) {
                            arrayList3.add(obj);
                        }
                    }
                    throw new IllegalStateException(("Surfaces are not yet available for " + cVar5 + "! Missing surfaces for " + arrayList3 + '!').toString());
                }
                arrayList.add(new r(outputConfiguration2, false, 1, null, null));
            } else if (cVar5.b() && arrayList2.size() != cVar5.n().size()) {
                r.Companion companion = r.INSTANCE;
                Size size2 = cVar5.getSize();
                h.e1.d deferredOutputType = cVar5.getDeferredOutputType();
                h.e1.c mirrorMode = cVar5.getMirrorMode();
                cVar5.p();
                h.e1.b dynamicRangeProfile = cVar5.getDynamicRangeProfile();
                h.e1.f streamUseCase = cVar5.getStreamUseCase();
                List<h.e1.e> listI = cVar5.i();
                boolean zO = cVar5.o();
                Integer groupNumber = cVar5.getGroupNumber();
                l3 l3VarB = r.Companion.b(companion, null, null, deferredOutputType, mirrorMode, null, dynamicRangeProfile, streamUseCase, listI, size2, zO, groupNumber != null ? groupNumber.intValue() : -1, !h.v.d(cVar5.getCamera(), bVar.getCamera()) ? cVar5.getCamera() : null, 2, null);
                if (l3VarB != null) {
                    arrayList.add(l3VarB);
                    Iterator<h.c0> it4 = cVar5.k().iterator();
                    while (it4.hasNext()) {
                        linkedHashMap.put(h.q1.a(it4.next().getId()), l3VarB);
                    }
                } else if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", "Failed to create AndroidOutputConfiguration for " + cVar5);
                }
            } else {
                if (arrayList2.size() != cVar5.n().size()) {
                    List<h.c0> listN3 = cVar5.n();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : listN3) {
                        if (!map.containsKey(h.q1.a(((h.c0) obj2).getId()))) {
                            arrayList4.add(obj2);
                        }
                    }
                    throw new IllegalStateException(("Surfaces are not yet available for " + cVar5 + "! Missing surfaces for " + arrayList4 + '!').toString());
                }
                r.Companion companion2 = r.INSTANCE;
                Surface surface4 = (Surface) pq.v.l0(arrayList2);
                h.e1.c mirrorMode2 = cVar5.getMirrorMode();
                cVar5.p();
                h.e1.b dynamicRangeProfile2 = cVar5.getDynamicRangeProfile();
                h.e1.f streamUseCase2 = cVar5.getStreamUseCase();
                List<h.e1.e> listI2 = cVar5.i();
                Size size3 = cVar5.getSize();
                boolean zO2 = cVar5.o();
                Integer groupNumber2 = cVar5.getGroupNumber();
                l3 l3VarB2 = r.Companion.b(companion2, surface4, null, null, mirrorMode2, null, dynamicRangeProfile2, streamUseCase2, listI2, size3, zO2, groupNumber2 != null ? groupNumber2.intValue() : -1, !h.v.d(cVar5.getCamera(), bVar.getCamera()) ? cVar5.getCamera() : null, 6, null);
                if (l3VarB2 != null) {
                    Iterator it5 = pq.v.f0(arrayList2, 1).iterator();
                    while (it5.hasNext()) {
                        l3VarB2.u((Surface) it5.next());
                    }
                    if (bVar.getPostviewStream() != null) {
                        h.c0 c0VarR = streamGraph.r(bVar.getPostviewStream());
                        if (c0VarR == null) {
                            throw new IllegalStateException("Postview Stream in StreamGraph cannot be null for reprocessing request");
                        }
                        if (l3Var == null && cVar5.n().contains(c0VarR)) {
                            l3Var = l3VarB2;
                        } else {
                            arrayList.add(l3VarB2);
                        }
                    } else {
                        arrayList.add(l3VarB2);
                    }
                } else if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", "Failed to create AndroidOutputConfiguration for " + cVar5);
                }
            }
        }
        return new OutputConfigurations(arrayList, linkedHashMap, l3Var, linkedHashMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<h.c1, Surface> c(Map<h.q1, ? extends Surface> map, StreamGraph streamGraph) {
        Map mapC = pq.v0.c();
        for (h.c0 c0Var : streamGraph.G()) {
            Surface surface = map.get(h.q1.a(c0Var.getId()));
            if (surface != null) {
                Iterator<h.e1> it = c0Var.b().iterator();
                while (it.hasNext()) {
                    mapC.put(h.c1.a(it.next().getId()), surface);
                }
            }
        }
        return pq.v0.b(mapC);
    }
}
