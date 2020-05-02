package ntnu20.imt3673.group4.aves

data class BirdImage(
    val name: String,
    val id: Int,
    val thumbnail: Int,
    val license: String
)

val searchRegister = mapOf(
    "fossekall cinclus cinclus" to listOf(
        BirdImage(
            "Fossekall (Cinclus cinclus)",
            R.drawable.fossekall_cinclus_cinclus0,
            R.drawable.thumb_fossekall_cinclus_cinclus0,
            "'Dipper....Cinclus cinclus' by Sarniebill1 via Flickr, Creative Commons Attribution."
        )
    ),
    "alkekonge alle alle" to listOf(
        BirdImage(
            "Alkekonge (Alle alle)",
            R.drawable.alkekonge_alle_alle0,
            R.drawable.thumb_alkekonge_alle_alle0,
            "'Little Auks' by Alastair Rae via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "trelerke lullula arborea" to listOf(
        BirdImage(
            "Trelerke (Lullula arborea)",
            R.drawable.trelerke_lullula_arborea0,
            R.drawable.thumb_trelerke_lullula_arborea0,
            "'Totovía (Lullula arborea). Woodlark' by Hhhalberto via Flickr, Creative Commons Attribution."
        )
    ),
    "toppdykker podiceps cristatus" to listOf(
        BirdImage(
            "Toppdykker (Podiceps cristatus)",
            R.drawable.toppdykker_podiceps_cristatus2,
            R.drawable.thumb_toppdykker_podiceps_cristatus2,
            "'Great Crested Grebe (Podiceps cristatus)' by Deanster1983 via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "sildemåke larus fuscus" to listOf(
        BirdImage(
            "Sildemåke (Larus fuscus)",
            R.drawable.sildemaake_larus_fuscus0,
            R.drawable.thumb_sildemaake_larus_fuscus0,
            "'Gaviota sombría Larus fuscus' by Agpov via Flickr, Creative Commons Attribution."
        )
    ),
    "fasan phasianus colchicus" to listOf(
        BirdImage(
            "Fasan (Phasianus colchicus)",
            R.drawable.fasan_phasianus_colchicus0,
            R.drawable.thumb_fasan_phasianus_colchicus0,
            "'Inquisitive pheasant' by Jo-h via Flickr, Creative Commons Attribution."
        )
    ),
    "alke alca torda" to listOf(
        BirdImage(
            "Alke (Alca torda)",
            R.drawable.alke_alca_torda0,
            R.drawable.thumb_alke_alca_torda0,
            "<a href='http://www.flickr.com/photos/ullkika/5959871911' rel='nofollow' target='_blank'>Foto: AnnaKika</a> (<a href='http://creativecommons.org/licenses/by/2.0/'>Lisens</a>)"
        )
    ),
    "snøugle bubo scandiacus" to listOf(
        BirdImage(
            "Snøugle (Bubo scandiacus)",
            R.drawable.snoeugle_bubo_scandiacus1,
            R.drawable.thumb_snoeugle_bubo_scandiacus1,
            "'Snowy Owl {Bubo scandiacus}' by Drew Avery via Flickr, Creative Commons Attribution."
        )
    ),
    "lappugle strix nebulosa" to listOf(
        BirdImage(
            "Lappugle (Strix nebulosa)",
            R.drawable.lappugle_strix_nebulosa0,
            R.drawable.thumb_lappugle_strix_nebulosa0,
            "'Great Gray Owl - Stern Gaze' by Jim.Richmond via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "pilfink passer montanus" to listOf(
        BirdImage(
            "Pilfink (Passer montanus)",
            R.drawable.pilfink_passer_montanus0,
            R.drawable.thumb_pilfink_passer_montanus0,
            "<a href='http://www.flickr.com/photos/lipkee/640434646/' rel='nofollow' target='_blank'>Foto: Lip Kee</a> (<a href='http://creativecommons.org/licenses/by-sa/2.0/'>Lisens</a>)"
        )
    ),
    "rødnebbterne sterna paradisaea" to listOf(
        BirdImage(
            "Rødnebbterne (Sterna paradisaea)",
            R.drawable.roednebbterne_sterna_paradisaea1,
            R.drawable.thumb_roednebbterne_sterna_paradisaea1,
            "'Sterna paradisaea, jeune et adulte' by Fr.zil via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "krykkje rissa tridactyla" to listOf(
        BirdImage(
            "Krykkje (Rissa tridactyla)",
            R.drawable.krykkje_rissa_tridactyla0,
            R.drawable.thumb_krykkje_rissa_tridactyla0,
            "'Black-legged Kittiwake' by Seabamirum via Flickr, Creative Commons Attribution."
        )
    ),
    "lomvi uria aalge" to listOf(
        BirdImage(
            "Lomvi (Uria aalge)",
            R.drawable.lomvi_uria_aalge0,
            R.drawable.thumb_lomvi_uria_aalge0,
            "'Common Murre' by Dawn Endico via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "gulerle motacilla flava" to listOf(
        BirdImage(
            "Gulerle (Motacilla flava)",
            R.drawable.gulerle_motacilla_flava0,
            R.drawable.thumb_gulerle_motacilla_flava0,
            "'IMG_8488' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "skjærpiplerke anthus petrosus" to listOf(
        BirdImage(
            "Skjærpiplerke (Anthus petrosus)",
            R.drawable.skjaerpiplerke_anthus_petrosus0,
            R.drawable.thumb_skjaerpiplerke_anthus_petrosus0,
            "'IMG_3540' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "granmeis poecile montanus" to listOf(
        BirdImage(
            "Granmeis (Poecile montanus)",
            R.drawable.granmeis_poecile_montanus0,
            R.drawable.thumb_granmeis_poecile_montanus0,
            "<a href='http://www.flickr.com/photos/davehamster/2279239813/' rel='nofollow' target='_blank'>Foto: Dave Hamster</a> (<a href='http://creativecommons.org/licenses/by/2.0/'>Lisens</a>)"
        )
    ),
    "myrsnipe calidris alpina" to listOf(
        BirdImage(
            "Myrsnipe (Calidris alpina)",
            R.drawable.myrsnipe_calidris_alpina1,
            R.drawable.thumb_myrsnipe_calidris_alpina1,
            "'Dunlin - Calidris alpina - Lóuþræll' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "ringgås branta bernicla" to listOf(
        BirdImage(
            "Ringgås (Branta bernicla)",
            R.drawable.ringgaas_branta_bernicla0,
            R.drawable.thumb_ringgaas_branta_bernicla0,
            "'Black Brant - Branta bernicla nigricans - Vestræn margæs' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "blåmeis cyanistes caeruleus" to listOf(
        BirdImage(
            "Blåmeis (Cyanistes caeruleus)",
            R.drawable.blaameis_cyanistes_caeruleus0,
            R.drawable.thumb_blaameis_cyanistes_caeruleus0,
            "<a href='http://www.flickr.com/photos/luc_viatour/4219904560/' rel='nofollow' target='_blank'>Foto: luc.viatour</a> (<a href='http://creativecommons.org/licenses/by-sa/2.0/'>Lisens</a>)"
        )
    ),
    "toppmeis lophophanes cristatus" to listOf(
        BirdImage(
            "Toppmeis (Lophophanes cristatus)",
            R.drawable.toppmeis_lophophanes_cristatus0,
            R.drawable.thumb_toppmeis_lophophanes_cristatus0,
            "'Lophophanes cristatus Luc Viatour' by Luc.viatour via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "vipe vanellus vanellus" to listOf(
        BirdImage(
            "Vipe (Vanellus vanellus)",
            R.drawable.vipe_vanellus_vanellus1,
            R.drawable.thumb_vipe_vanellus_vanellus1,
            "<a href='http://www.flickr.com/photos/rainbirder/4717975631/' rel='nofollow' target='_blank'>Foto: Rainbirder</a> (<a href='http://creativecommons.org/licenses/by-sa/2.0/'>Lisens</a>)"
        )
    ),
    "grønnspett picus viridis" to listOf(
        BirdImage(
            "Grønnspett (Picus viridis)",
            R.drawable.groennspett_picus_viridis0,
            R.drawable.thumb_groennspett_picus_viridis0,
            "'✿ Picus viridis ✿' by ✿ nicolas_gent ✿ via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "hønsehauk accipiter gentilis" to listOf(
        BirdImage(
            "Hønsehauk (Accipiter gentilis)",
            R.drawable.hoensehauk_accipiter_gentilis0,
            R.drawable.thumb_hoensehauk_accipiter_gentilis0,
            "'Azor' by Edans via Flickr, Creative Commons Attribution."
        )
    ),
    "europeisk bieter merops apiaster" to listOf(
        BirdImage(
            "Europeisk bieter (Merops apiaster)",
            R.drawable.europeisk_bieter_merops_apiaster0,
            R.drawable.thumb_europeisk_bieter_merops_apiaster0,
            "'European Bee-eater - Merops apiaster - Býsvelgur' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "svarthvit fluesnapper ficedula hypoleuca" to listOf(
        BirdImage(
            "Svarthvit fluesnapper (Ficedula hypoleuca)",
            R.drawable.svarthvit_fluesnapper_ficedula_hypoleuca1,
            R.drawable.thumb_svarthvit_fluesnapper_ficedula_hypoleuca1,
            "'Pied Flycatcher (Ficedula hypoleuca)' by Rainbirder via Flickr, Creative Commons Attribution ShareAlike."
        ),
        BirdImage(
            "Svarthvit fluesnapper (Ficedula hypoleuca)",
            R.drawable.svarthvit_fluesnapper_ficedula_hypoleuca0,
            R.drawable.thumb_svarthvit_fluesnapper_ficedula_hypoleuca0,
            "'Papamosca cerrojillo. (Ficedula hypoleuca)(♀)' by Juan_e via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "lappiplerke anthus cervinus" to listOf(
        BirdImage(
            "Lappiplerke (Anthus cervinus)",
            R.drawable.lappiplerke_anthus_cervinus0,
            R.drawable.thumb_lappiplerke_anthus_cervinus0,
            "'New Friend' by CharlesLam via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "grankorsnebb loxia curvirostra" to listOf(
        BirdImage(
            "Grankorsnebb (Loxia curvirostra)",
            R.drawable.grankorsnebb_loxia_curvirostra0,
            R.drawable.thumb_grankorsnebb_loxia_curvirostra0,
            "'Red Crossbill at Seven Presidents Park' by Dendroica cerulea via Flickr, Creative Commons Attribution."
        )
    ),
    "sangsvane cygnus cygnus" to listOf(
        BirdImage(
            "Sangsvane (Cygnus cygnus)",
            R.drawable.sangsvane_cygnus_cygnus0,
            R.drawable.thumb_sangsvane_cygnus_cygnus0,
            "DickDaniels via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "trostesanger acrocephalus arundinaceus" to listOf(
        BirdImage(
            "Trostesanger (Acrocephalus arundinaceus)",
            R.drawable.trostesanger_acrocephalus_arundinaceus0,
            R.drawable.thumb_trostesanger_acrocephalus_arundinaceus0,
            "'Carricero tordal Acrocephalus arundinaceus' by Agpov via Flickr, Creative Commons Attribution."
        )
    ),
    "strandsnipe actitis hypoleucos" to listOf(
        BirdImage(
            "Strandsnipe (Actitis hypoleucos)",
            R.drawable.strandsnipe_actitis_hypoleucos0,
            R.drawable.thumb_strandsnipe_actitis_hypoleucos0,
            "'Common Sandpiper (Actitis hypoleucos)' by Lip Kee via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "båndkorsnebb loxia leucoptera" to listOf(
        BirdImage(
            "Båndkorsnebb (Loxia leucoptera)",
            R.drawable.baandkorsnebb_loxia_leucoptera0,
            R.drawable.thumb_baandkorsnebb_loxia_leucoptera0,
            "'White-winged Crossbill' by Seabamirum via Flickr, Creative Commons Attribution."
        )
    ),
    "løvmeis poecile palustris" to listOf(
        BirdImage(
            "Løvmeis (Poecile palustris)",
            R.drawable.loevmeis_poecile_palustris0,
            R.drawable.thumb_loevmeis_poecile_palustris0,
            "'Mésange nonnette' by Photo sergio via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "hærfugl upupa epops" to listOf(
        BirdImage(
            "Hærfugl (Upupa epops)",
            R.drawable.haerfugl_upupa_epops0,
            R.drawable.thumb_haerfugl_upupa_epops0,
            "<a href='http://commons.wikimedia.org/wiki/File:ABUBILLA_%28Upupa_epops%29.jpg' rel='nofollow' target='_blank'>Foto: Arturo Nikolai</a> (<a href='http://creativecommons.org/licenses/by-sa/3.0/deed.en'>Lisens</a>)"
        )
    ),
    "hvitryggspett dendrocopos leucotos" to listOf(
        BirdImage(
            "Hvitryggspett (Dendrocopos leucotos)",
            R.drawable.hvitryggspett_dendrocopos_leucotos0,
            R.drawable.thumb_hvitryggspett_dendrocopos_leucotos0,
            "'White-backed Woodpecker' by Alastair Rae via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "blåstrupe luscinia svecica" to listOf(
        BirdImage(
            "Blåstrupe (Luscinia svecica)",
            R.drawable.blaastrupe_luscinia_svecica0,
            R.drawable.thumb_blaastrupe_luscinia_svecica0,
            "'Bluethroat' by Matt Tillett via Flickr, Creative Commons Attribution."
        )
    ),
    "hornugle asio otus" to listOf(
        BirdImage(
            "Hornugle (Asio otus)",
            R.drawable.hornugle_asio_otus0,
            R.drawable.thumb_hornugle_asio_otus0,
            "''No!'' by Peter G Trimming via Flickr, Creative Commons Attribution."
        )
    ),
    "kanadagås branta canadensis" to listOf(
        BirdImage(
            "Kanadagås (Branta canadensis)",
            R.drawable.kanadagaas_branta_canadensis0,
            R.drawable.thumb_kanadagaas_branta_canadensis0,
            "'4 of 5 Canada Goose (Branta canadensis) - Four Canada Geese were resting and feeding(square) Canada ' by Mikebaird via Flickr, Creative Commons Attribution."
        )
    ),
    "fiskeørn pandion haliaetus" to listOf(
        BirdImage(
            "Fiskeørn (Pandion haliaetus)",
            R.drawable.fiskeoern_pandion_haliaetus0,
            R.drawable.thumb_fiskeoern_pandion_haliaetus0,
            "'Osprey_mg_9789 Osprey Pandion haliaetus' by Mikebaird via Flickr, Creative Commons Attribution."
        )
    ),
    "bjørkefink fringilla montifringilla" to listOf(
        BirdImage(
            "Bjørkefink (Fringilla montifringilla)",
            R.drawable.bjoerkefink_fringilla_montifringilla0,
            R.drawable.thumb_bjoerkefink_fringilla_montifringilla0,
            "'IMG_2723' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "ismåke pagophila eburnea" to listOf(
        BirdImage(
            "Ismåke (Pagophila eburnea)",
            R.drawable.ismaake_pagophila_eburnea0,
            R.drawable.thumb_ismaake_pagophila_eburnea0,
            "'Ivory Gull - Pagophila eburnea - Ísmáfur' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "svarttrost turdus merula" to listOf(
        BirdImage(
            "Svarttrost (Turdus merula)",
            R.drawable.svarttrost_turdus_merula0,
            R.drawable.thumb_svarttrost_turdus_merula0,
            "<a href='http://www.flickr.com/photos/lipkee/459814709/' rel='nofollow' target='_blank'>Foto: Lip Kee</a> (<a href='http://creativecommons.org/licenses/by-sa/2.0/'>Lisens</a>)"
        )
    ),
    "flaggspett dendrocopos major" to listOf(
        BirdImage(
            "Flaggspett (Dendrocopos major)",
            R.drawable.flaggspett_dendrocopos_major1,
            R.drawable.thumb_flaggspett_dendrocopos_major1,
            "'Pic épeiche sur un poteau électrique' by ComputerHotline via Flickr, Creative Commons Attribution."
        )
    ),
    "kjernebiter coccothraustes coccothraustes" to listOf(
        BirdImage(
            "Kjernebiter (Coccothraustes coccothraustes)",
            R.drawable.kjernebiter_coccothraustes_coccothraustes2,
            R.drawable.thumb_kjernebiter_coccothraustes_coccothraustes2,
            "'E51010_c153662' by Hr.icio via Flickr, Creative Commons Attribution."
        )
    ),
    "rødvingetrost turdus iliacus" to listOf(
        BirdImage(
            "Rødvingetrost (Turdus iliacus)",
            R.drawable.roedvingetrost_turdus_iliacus0,
            R.drawable.thumb_roedvingetrost_turdus_iliacus0,
            "'Redwing - Turdus iliacus - Skógarþröstur' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "polarlomvi uria lomvia" to listOf(
        BirdImage(
            "Polarlomvi (Uria lomvia)",
            R.drawable.polarlomvi_uria_lomvia0,
            R.drawable.thumb_polarlomvi_uria_lomvia0,
            "'Brünnich's Guillemot' by Alastair Rae via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "smålom gavia stellata" to listOf(
        BirdImage(
            "Smålom (Gavia stellata)",
            R.drawable.smaalom_gavia_stellata0,
            R.drawable.thumb_smaalom_gavia_stellata0,
            "'Red-throated Diver - Gavia stellata -  Lómur' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "vintererle motacilla cinerea" to listOf(
        BirdImage(
            "Vintererle (Motacilla cinerea)",
            R.drawable.vintererle_motacilla_cinerea0,
            R.drawable.thumb_vintererle_motacilla_cinerea0,
            "'Grey wagtail (Motacilla cinerea robusta)' by Lip Kee via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "dompap pyrrhula pyrrhula" to listOf(
        BirdImage(
            "Dompap (Pyrrhula pyrrhula)",
            R.drawable.dompap_pyrrhula_pyrrhula0,
            R.drawable.thumb_dompap_pyrrhula_pyrrhula0,
            "'Pyrrhula pyrrhula - Bouvreuil pivoine' by Didier.bier via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "havørn haliaeetus albicilla" to listOf(
        BirdImage(
            "Havørn (Haliaeetus albicilla)",
            R.drawable.havoern_haliaeetus_albicilla2,
            R.drawable.thumb_havoern_haliaeetus_albicilla2,
            "'Haliaeetus albicilla' by Jörg Hempel via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "ravn corvus corax" to listOf(
        BirdImage(
            "Ravn (Corvus corax)",
            R.drawable.ravn_corvus_corax0,
            R.drawable.thumb_ravn_corvus_corax0,
            "'Corvus corax Common Raven' by Davidhofmann08 via Flickr, Creative Commons Attribution."
        )
    ),
    "hagesanger sylvia borin" to listOf(
        BirdImage(
            "Hagesanger (Sylvia borin)",
            R.drawable.hagesanger_sylvia_borin0,
            R.drawable.thumb_hagesanger_sylvia_borin0,
            "'Garden Warbler (Sylvia borin)' by Rainbirder via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "sidensvans bombycilla garrulus" to listOf(
        BirdImage(
            "Sidensvans (Bombycilla garrulus)",
            R.drawable.sidensvans_bombycilla_garrulus1,
            R.drawable.thumb_sidensvans_bombycilla_garrulus1,
            "'Waxwings' by Tim Ebbs via Flickr, Creative Commons Attribution."
        )
    ),
    "bøksanger phylloscopus sibilatrix" to listOf(
        BirdImage(
            "Bøksanger (Phylloscopus sibilatrix)",
            R.drawable.boeksanger_phylloscopus_sibilatrix0,
            R.drawable.thumb_boeksanger_phylloscopus_sibilatrix0,
            "'Wood Warbler (Phylloscopus sibilatrix), Rocherath, Belgium' by Frank.Vassen via Flickr, Creative Commons Attribution."
        )
    ),
    "spurvehauk accipiter nisus" to listOf(
        BirdImage(
            "Spurvehauk (Accipiter nisus)",
            R.drawable.spurvehauk_accipiter_nisus0,
            R.drawable.thumb_spurvehauk_accipiter_nisus0,
            "'Sparrow Hawk (Accipiter nisus), Eating' by Mcamcamca via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "dvergsnipe calidris minuta" to listOf(
        BirdImage(
            "Dvergsnipe (Calidris minuta)",
            R.drawable.dvergsnipe_calidris_minuta1,
            R.drawable.thumb_dvergsnipe_calidris_minuta1,
            "'Little Stint  (Calidris minuta) ' by Ian.white1 via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "teist cepphus grylle" to listOf(
        BirdImage(
            "Teist (Cepphus grylle)",
            R.drawable.teist_cepphus_grylle0,
            R.drawable.thumb_teist_cepphus_grylle0,
            "'Black Guillemot - Cepphus grylle - Teista' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "svartmeis periparus ater" to listOf(
        BirdImage(
            "Svartmeis (Periparus ater)",
            R.drawable.svartmeis_periparus_ater0,
            R.drawable.thumb_svartmeis_periparus_ater0,
            "'Coal Tit 1a' by Ahisgett via Flickr, Creative Commons Attribution."
        )
    ),
    "kjøttmeis parus major" to listOf(
        BirdImage(
            "Kjøttmeis (Parus major)",
            R.drawable.kjoettmeis_parus_major1,
            R.drawable.thumb_kjoettmeis_parus_major1,
            "<a href='http://www.flickr.com/photos/luc_viatour/3021211039/' rel='nofollow' target='_blank'>Foto: luc.viatour</a> (<a href='http://creativecommons.org/licenses/by-sa/2.0/'>Lisens</a>)"
        )
    ),
    "tårnfalk falco tinnunculus" to listOf(
        BirdImage(
            "Tårnfalk (Falco tinnunculus)",
            R.drawable.taarnfalk_falco_tinnunculus0,
            R.drawable.thumb_taarnfalk_falco_tinnunculus0,
            "'Cernicalo cumun 00 - Common-Kestrel - Falco-tinnunculus' by Ferran pestaña via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "jordugle asio flammeus" to listOf(
        BirdImage(
            "Jordugle (Asio flammeus)",
            R.drawable.jordugle_asio_flammeus0,
            R.drawable.thumb_jordugle_asio_flammeus0,
            "'IMG_4812-9.jpg' by Joanne Goldby via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "brunnakke anas penelope" to listOf(
        BirdImage(
            "Brunnakke (Anas penelope)",
            R.drawable.brunnakke_anas_penelope1,
            R.drawable.thumb_brunnakke_anas_penelope1,
            "Dick Daniels via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "fjellerke eremophila alpestris" to listOf(
        BirdImage(
            "Fjellerke (Eremophila alpestris)",
            R.drawable.fjellerke_eremophila_alpestris1,
            R.drawable.thumb_fjellerke_eremophila_alpestris1,
            "'Horned Lark' by Kelly Colgan Azar via Flickr, Creative Commons Attribution-NoDerivs."
        ),
        BirdImage(
            "Fjellerke (Eremophila alpestris)",
            R.drawable.fjellerke_eremophila_alpestris0,
            R.drawable.thumb_fjellerke_eremophila_alpestris0,
            "'Horned Lark (Eremophila alpestris)' by Photogramma1 via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "rørsanger acrocephalus scirpaceus" to listOf(
        BirdImage(
            "Rørsanger (Acrocephalus scirpaceus)",
            R.drawable.roersanger_acrocephalus_scirpaceus0,
            R.drawable.thumb_roersanger_acrocephalus_scirpaceus0,
            "'Boscarla de canyar 01 - carricero común - reed warbler - acrocephalus scirpaceus' by Ferran pestaña via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "kråke corvus cornix" to listOf(
        BirdImage(
            "Kråke (Corvus cornix)",
            R.drawable.kraake_corvus_cornix2,
            R.drawable.thumb_kraake_corvus_cornix2,
            "'Hooded crow; Corvus cornix' by Matvey Andreyev via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "steinskvett oenanthe oenanthe" to listOf(
        BirdImage(
            "Steinskvett (Oenanthe oenanthe)",
            R.drawable.steinskvett_oenanthe_oenanthe0,
            R.drawable.thumb_steinskvett_oenanthe_oenanthe0,
            "'Northern Wheatear (Oenanthe oenanthe)' by Sussexbirder via Flickr, Creative Commons Attribution."
        )
    ),
    "myrhauk circus cyaneus" to listOf(
        BirdImage(
            "Myrhauk (Circus cyaneus)",
            R.drawable.myrhauk_circus_cyaneus0,
            R.drawable.thumb_myrhauk_circus_cyaneus0,
            "'Low-flying harrier' by Wolfpix via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "storspove numenius arquata" to listOf(
        BirdImage(
            "Storspove (Numenius arquata)",
            R.drawable.storspove_numenius_arquata1,
            R.drawable.thumb_storspove_numenius_arquata1,
            "'El baño del zarapito - the bath of the eurasian-curlew 05' by Ferran pestaña via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "snøspurv plectrophenax nivalis" to listOf(
        BirdImage(
            "Snøspurv (Plectrophenax nivalis)",
            R.drawable.snoespurv_plectrophenax_nivalis2,
            R.drawable.thumb_snoespurv_plectrophenax_nivalis2,
            "'Snow Bunting (plectrophenax nivalis)' by Drew Avery via Flickr, Creative Commons Attribution."
        )
    ),
    "gråspett picus canus" to listOf(
        BirdImage(
            "Gråspett (Picus canus)",
            R.drawable.graaspett_picus_canus0,
            R.drawable.thumb_graaspett_picus_canus0,
            "'Grey-headed Woodpecker (Picus canus), Białowieża, Poland' by Frank.Vassen via Flickr, Creative Commons Attribution."
        )
    ),
    "vandrefalk falco peregrinus" to listOf(
        BirdImage(
            "Vandrefalk (Falco peregrinus)",
            R.drawable.vandrefalk_falco_peregrinus0,
            R.drawable.thumb_vandrefalk_falco_peregrinus0,
            "JonDissed via Flickr, Creative Commons Attribution."
        )
    ),
    "måltrost turdus philomelos" to listOf(
        BirdImage(
            "Måltrost (Turdus philomelos)",
            R.drawable.maaltrost_turdus_philomelos0,
            R.drawable.thumb_maaltrost_turdus_philomelos0,
            "'IMG_5764' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "fuglekonge regulus regulus" to listOf(
        BirdImage(
            "Fuglekonge (Regulus regulus)",
            R.drawable.fuglekonge_regulus_regulus0,
            R.drawable.thumb_fuglekonge_regulus_regulus0,
            "'FEMALE GOLDCREST regulus regulus' by 60North via Flickr, Creative Commons Attribution."
        )
    ),
    "ringdue columba palumbus" to listOf(
        BirdImage(
            "Ringdue (Columba palumbus)",
            R.drawable.ringdue_columba_palumbus0,
            R.drawable.thumb_ringdue_columba_palumbus0,
            "'Wood pigeon - Columba palumbus - Hringdúfa' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "taksvale delichon urbica" to listOf(
        BirdImage(
            "Taksvale (Delichon urbica)",
            R.drawable.taksvale_delichon_urbica0,
            R.drawable.thumb_taksvale_delichon_urbica0,
            "'House martin' by Wit via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "havhest fulmarus glacialis" to listOf(
        BirdImage(
            "Havhest (Fulmarus glacialis)",
            R.drawable.havhest_fulmarus_glacialis1,
            R.drawable.thumb_havhest_fulmarus_glacialis1,
            "'Fulmar' by Hello, I am Bruce via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "grønnfink carduelis chloris" to listOf(
        BirdImage(
            "Grønnfink (Carduelis chloris)",
            R.drawable.groennfink_carduelis_chloris0,
            R.drawable.thumb_groennfink_carduelis_chloris0,
            "'Greenfinch (Carduelis chloris)' by Robin_24 via Flickr, Creative Commons Attribution."
        )
    ),
    "konglebit pinicola enucleator" to listOf(
        BirdImage(
            "Konglebit (Pinicola enucleator)",
            R.drawable.konglebit_pinicola_enucleator0,
            R.drawable.thumb_konglebit_pinicola_enucleator0,
            "'Pine Grosbeak, Pinicola enucleator, adult male' by Bill Bouton via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "munk sylvia atricapilla" to listOf(
        BirdImage(
            "Munk (Sylvia atricapilla)",
            R.drawable.munk_sylvia_atricapilla1,
            R.drawable.thumb_munk_sylvia_atricapilla1,
            "'Curruca capirotada ♂ Sylvia atricapilla' by Agpov via Flickr, Creative Commons Attribution."
        )
    ),
    "stjertmeis aegithalos caudatus" to listOf(
        BirdImage(
            "Stjertmeis (Aegithalos caudatus)",
            R.drawable.stjertmeis_aegithalos_caudatus0,
            R.drawable.thumb_stjertmeis_aegithalos_caudatus0,
            "'Long-tailed tit  (Aegithalos caudatus) juvenil' by Insecta62 via Flickr, Creative Commons Attribution."
        )
    ),
    "dverglo charadrius dubius" to listOf(
        BirdImage(
            "Dverglo (Charadrius dubius)",
            R.drawable.dverglo_charadrius_dubius0,
            R.drawable.thumb_dverglo_charadrius_dubius0,
            "'Chorlitejo chico (Charadrius dubius)' by Juan_e via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "linerle motacilla alba" to listOf(
        BirdImage(
            "Linerle (Motacilla alba)",
            R.drawable.linerle_motacilla_alba2,
            R.drawable.thumb_linerle_motacilla_alba2,
            "'White Wagtail (Motacilla alba)' by Lip Kee via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "kongeørn aquila chrysaetos" to listOf(
        BirdImage(
            "Kongeørn (Aquila chrysaetos)",
            R.drawable.kongeoern_aquila_chrysaetos0,
            R.drawable.thumb_kongeoern_aquila_chrysaetos0,
            "'Golden Eagle 3a' by Ahisgett via Flickr, Creative Commons Attribution."
        )
    ),
    "gransanger phylloscopus collybita" to listOf(
        BirdImage(
            "Gransanger (Phylloscopus collybita)",
            R.drawable.gransanger_phylloscopus_collybita0,
            R.drawable.thumb_gransanger_phylloscopus_collybita0,
            "'IMG_6474' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "perleugle aegolius funereus" to listOf(
        BirdImage(
            "Perleugle (Aegolius funereus)",
            R.drawable.perleugle_aegolius_funereus0,
            R.drawable.thumb_perleugle_aegolius_funereus0,
            "'Tengmalms Owl' by Alastair Rae via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "gluttsnipe tringa nebularia" to listOf(
        BirdImage(
            "Gluttsnipe (Tringa nebularia)",
            R.drawable.gluttsnipe_tringa_nebularia0,
            R.drawable.thumb_gluttsnipe_tringa_nebularia0,
            "'Archibebe claro 02 - greenshank - tringa nebularia' by Ferran pestaña via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "jernspurv prunella modularis" to listOf(
        BirdImage(
            "Jernspurv (Prunella modularis)",
            R.drawable.jernspurv_prunella_modularis0,
            R.drawable.thumb_jernspurv_prunella_modularis0,
            "'Acentor-64' by Paco Gómez via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "dverglerke calandrella brachydactyla" to listOf(
        BirdImage(
            "Dverglerke (Calandrella brachydactyla)",
            R.drawable.dverglerke_calandrella_brachydactyla0,
            R.drawable.thumb_dverglerke_calandrella_brachydactyla0,
            "'Short-toed Lark (Calandrella brachydactyla)' by Lip Kee via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "lerkefalk falco subbuteo" to listOf(
        BirdImage(
            "Lerkefalk (Falco subbuteo)",
            R.drawable.lerkefalk_falco_subbuteo0,
            R.drawable.thumb_lerkefalk_falco_subbuteo0,
            "'Ógea (Falco subbuteo)' by Rodrigo Saldanha de Almeida. via Flickr, Creative Commons Attribution."
        )
    ),
    "grønnsisik carduelis spinus" to listOf(
        BirdImage(
            "Grønnsisik (Carduelis spinus)",
            R.drawable.groennsisik_carduelis_spinus1,
            R.drawable.thumb_groennsisik_carduelis_spinus1,
            "'Eurasian Siskin - Carduelis spinus - Barrfinka' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "grågås anser anser" to listOf(
        BirdImage(
            "Grågås (Anser anser)",
            R.drawable.graagaas_anser_anser0,
            R.drawable.thumb_graagaas_anser_anser0,
            "André Karwath aka Aka via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "løvsanger phylloscopus trochilus" to listOf(
        BirdImage(
            "Løvsanger (Phylloscopus trochilus)",
            R.drawable.loevsanger_phylloscopus_trochilus0,
            R.drawable.thumb_loevsanger_phylloscopus_trochilus0,
            "<a href='http://www.flickr.com/photos/rainbirder/4612215849/' rel='nofollow' target='_blank'>Foto: Rainbirder</a> (<a href='http://creativecommons.org/licenses/by-sa/2.0/deed.en'>Lisens</a>)"
        )
    ),
    "tornirisk carduelis cannabina" to listOf(
        BirdImage(
            "Tornirisk (Carduelis cannabina)",
            R.drawable.tornirisk_carduelis_cannabina0,
            R.drawable.thumb_tornirisk_carduelis_cannabina0,
            "'Pardillo común, macho' by Trebol-a via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "laksand mergus merganser" to listOf(
        BirdImage(
            "Laksand (Mergus merganser)",
            R.drawable.laksand_mergus_merganser0,
            R.drawable.thumb_laksand_mergus_merganser0,
            "Jesmond Dene via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "nøttekråke nucifraga caryocatactes" to listOf(
        BirdImage(
            "Nøttekråke (Nucifraga caryocatactes)",
            R.drawable.noettekraake_nucifraga_caryocatactes0,
            R.drawable.thumb_noettekraake_nucifraga_caryocatactes0,
            "'Nucifraga caryocatactes - Nocciolaia sorpresa in legnaia - Dino Olivieri' by Dino_olivieri via Flickr, Creative Commons Attribution."
        )
    ),
    "jaktfalk falco rusticolus" to listOf(
        BirdImage(
            "Jaktfalk (Falco rusticolus)",
            R.drawable.jaktfalk_falco_rusticolus0,
            R.drawable.thumb_jaktfalk_falco_rusticolus0,
            "'Gyrfalcon (falco rusticolus)' by Dobak via Flickr, Creative Commons Attribution."
        )
    ),
    "orrfugl skogsfugl lyrurus tetrix" to listOf(
        BirdImage(
            "Orrfugl, skogsfugl (Lyrurus tetrix)",
            R.drawable.orrfugl_skogsfugl_lyrurus_tetrix0,
            R.drawable.thumb_orrfugl_skogsfugl_lyrurus_tetrix0,
            "'Black Grouse' by Alastair Rae via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "polarsnipe calidris canutus" to listOf(
        BirdImage(
            "Polarsnipe (Calidris canutus)",
            R.drawable.polarsnipe_calidris_canutus0,
            R.drawable.thumb_polarsnipe_calidris_canutus0,
            "'Knot, Calidris canutus' by Eaglestein via Flickr, Creative Commons Attribution."
        )
    ),
    "småspove numenius phaeopus" to listOf(
        BirdImage(
            "Småspove (Numenius phaeopus)",
            R.drawable.smaaspove_numenius_phaeopus0,
            R.drawable.thumb_smaaspove_numenius_phaeopus0,
            "'Whimbrel (Numenius phaeopus)  whimbrel-bird-morro-strand' by Mikebaird via Flickr, Creative Commons Attribution."
        )
    ),
    "fjæreplytt calidris maritima" to listOf(
        BirdImage(
            "Fjæreplytt (Calidris maritima)",
            R.drawable.fjaereplytt_calidris_maritima1,
            R.drawable.thumb_fjaereplytt_calidris_maritima1,
            "'Purple Sandpiper' by Dendroica cerulea via Flickr, Creative Commons Attribution."
        )
    ),
    "sivsanger acrocephalus schoenobaenus" to listOf(
        BirdImage(
            "Sivsanger (Acrocephalus schoenobaenus)",
            R.drawable.sivsanger_acrocephalus_schoenobaenus0,
            R.drawable.thumb_sivsanger_acrocephalus_schoenobaenus0,
            "'IMG_6519' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "tårnugle slørugle tyto alba" to listOf(
        BirdImage(
            "Tårnugle, slørugle (Tyto alba)",
            R.drawable.taarnugle_sloerugle_tyto_alba2,
            R.drawable.thumb_taarnugle_sloerugle_tyto_alba2,
            "'Barn Owl / Tyto alba / 面梟(メンフクロウ)' by TANAKA Juuyoh (田中十洋) via Flickr, Creative Commons Attribution."
        )
    ),
    "rødstrupe erithacus rubecula" to listOf(
        BirdImage(
            "Rødstrupe (Erithacus rubecula)",
            R.drawable.roedstrupe_erithacus_rubecula0,
            R.drawable.thumb_roedstrupe_erithacus_rubecula0,
            "'Rouge-gorge' by JR Guillaumin via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "skogdue columba oenas" to listOf(
        BirdImage(
            "Skogdue (Columba oenas)",
            R.drawable.skogdue_columba_oenas0,
            R.drawable.thumb_skogdue_columba_oenas0,
            "'IMG_9685' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "alaskasnipe calidris melanotos" to listOf(
        BirdImage(
            "Alaskasnipe (Calidris melanotos)",
            R.drawable.alaskasnipe_calidris_melanotos1,
            R.drawable.thumb_alaskasnipe_calidris_melanotos1,
            "'Pectoral Sandpiper - Calidris melanotos - Rákatíta' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "kvinand bucephala clangula" to listOf(
        BirdImage(
            "Kvinand (Bucephala clangula)",
            R.drawable.kvinand_bucephala_clangula3,
            R.drawable.thumb_kvinand_bucephala_clangula3,
            "'Goldeneye (Bucephala clangula)' by Dave Hamster via Flickr, Creative Commons Attribution."
        )
    ),
    "bokfink fringilla coelebs" to listOf(
        BirdImage(
            "Bokfink (Fringilla coelebs)",
            R.drawable.bokfink_fringilla_coelebs0,
            R.drawable.thumb_bokfink_fringilla_coelebs0,
            "<a href=''>Foto: rubund</a> (<a href='http://creativecommons.org/licenses/by-sa/2.0/'>Lisens</a>)"
        )
    ),
    "aftenfalk falco vespertinus" to listOf(
        BirdImage(
            "Aftenfalk (Falco vespertinus)",
            R.drawable.aftenfalk_falco_vespertinus0,
            R.drawable.thumb_aftenfalk_falco_vespertinus0,
            "'Falcon Red Footed falco vespertinus,Skala Kalloni Salt Pans 08/05/10' by Mick Sway via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "blåråke coracias garrulus" to listOf(
        BirdImage(
            "Blåråke (Coracias garrulus)",
            R.drawable.blaaraake_coracias_garrulus0,
            R.drawable.thumb_blaaraake_coracias_garrulus0,
            "'Roller ( coracias garrulus) Petra - Kalloni rd nr Stipsi turn 12/05/11' by Mick Sway via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "stær sturnus vulgaris" to listOf(
        BirdImage(
            "Stær (Sturnus vulgaris)",
            R.drawable.staer_sturnus_vulgaris0,
            R.drawable.thumb_staer_sturnus_vulgaris0,
            "<a href='http://www.flickr.com/photos/peuplier/481422016/' rel='nofollow' target='_blank'>Foto: peuplier</a> (<a href='http://creativecommons.org/licenses/by-nd/2.0/deed'>Lisens</a>)"
        )
    ),
    "sivspurv emberiza schoeniclus" to listOf(
        BirdImage(
            "Sivspurv (Emberiza schoeniclus)",
            R.drawable.sivspurv_emberiza_schoeniclus1,
            R.drawable.thumb_sivspurv_emberiza_schoeniclus1,
            "'IMG_8079' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "kortnebbgås anser brachyrhynchus" to listOf(
        BirdImage(
            "Kortnebbgås (Anser brachyrhynchus)",
            R.drawable.kortnebbgaas_anser_brachyrhynchus0,
            R.drawable.thumb_kortnebbgaas_anser_brachyrhynchus0,
            "'Pink-footed Goose - Anser brachyrhynchus - Heiðagæs' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "dvergmåke hydrocoloeus minutus" to listOf(
        BirdImage(
            "Dvergmåke (Hydrocoloeus minutus)",
            R.drawable.dvergmaake_hydrocoloeus_minutus0,
            R.drawable.thumb_dvergmaake_hydrocoloeus_minutus0,
            "'Little Gull (Larus minutus)' by Dominic sherony via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "trepiplerke anthus trivialis" to listOf(
        BirdImage(
            "Trepiplerke (Anthus trivialis)",
            R.drawable.trepiplerke_anthus_trivialis0,
            R.drawable.thumb_trepiplerke_anthus_trivialis0,
            "'Baumpieper (Anthus trivialis), Kappertzvenn bei Mürringen, Ostbelgien' by Frank.Vassen via Flickr, Creative Commons Attribution."
        )
    ),
    "makrellterne sterna hirundo" to listOf(
        BirdImage(
            "Makrellterne (Sterna hirundo)",
            R.drawable.makrellterne_sterna_hirundo0,
            R.drawable.thumb_makrellterne_sterna_hirundo0,
            "'Common Tern (Sterna hirundo)' by Ian.white1 via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "sandløper calidris alba" to listOf(
        BirdImage(
            "Sandløper (Calidris alba)",
            R.drawable.sandloeper_calidris_alba2,
            R.drawable.thumb_sandloeper_calidris_alba2,
            "'Sanderling (Calidris alba)' by Alan Vernon. via Flickr, Creative Commons Attribution."
        )
    ),
    "temminicksnipe calidris temminckii" to listOf(
        BirdImage(
            "Temminicksnipe (Calidris temminckii)",
            R.drawable.temminicksnipe_calidris_temminckii0,
            R.drawable.thumb_temminicksnipe_calidris_temminckii0,
            "'Stint Temminck's ( calidris temminckii) Skala Kalloni Salt Pans Lesvos 06/05/11' by Mick Sway via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "ærfugl somateria mollissima" to listOf(
        BirdImage(
            "Ærfugl (Somateria mollissima)",
            R.drawable.aerfugl_somateria_mollissima1,
            R.drawable.thumb_aerfugl_somateria_mollissima1,
            "Andreas Trepte via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "sanglerke alauda arvensis" to listOf(
        BirdImage(
            "Sanglerke (Alauda arvensis)",
            R.drawable.sanglerke_alauda_arvensis0,
            R.drawable.thumb_sanglerke_alauda_arvensis0,
            "'Skowronek (Alauda arvensis)' by Mmlolek via Flickr, Creative Commons Attribution."
        )
    ),
    "sothøne fulica atra" to listOf(
        BirdImage(
            "Sothøne (Fulica atra)",
            R.drawable.sothoene_fulica_atra0,
            R.drawable.thumb_sothoene_fulica_atra0,
            "'Folaga (Fulica atra)' by Il cantiere via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "slagugle strix uralensis" to listOf(
        BirdImage(
            "Slagugle (Strix uralensis)",
            R.drawable.slagugle_strix_uralensis0,
            R.drawable.thumb_slagugle_strix_uralensis0,
            "'P9036533.jpg' by Johann-Nikolaus Andreae via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "toppand aythya fuligula" to listOf(
        BirdImage(
            "Toppand (Aythya fuligula)",
            R.drawable.toppand_aythya_fuligula0,
            R.drawable.thumb_toppand_aythya_fuligula0,
            "Richard Bartz, Munich Makro Freak via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "markpiplerke anthus campestris" to listOf(
        BirdImage(
            "Markpiplerke (Anthus campestris)",
            R.drawable.markpiplerke_anthus_campestris0,
            R.drawable.thumb_markpiplerke_anthus_campestris0,
            "'Tawny Pipit ( Anthus campestris)' by Lip Kee via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "gråhegre ardea cinerea" to listOf(
        BirdImage(
            "Gråhegre (Ardea cinerea)",
            R.drawable.graahegre_ardea_cinerea1,
            R.drawable.thumb_graahegre_ardea_cinerea1,
            "'Grey Heron (Ardea cinerea) - lmmature' by Lip Kee via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "tundrasnipe calidris ferruginea" to listOf(
        BirdImage(
            "Tundrasnipe (Calidris ferruginea)",
            R.drawable.tundrasnipe_calidris_ferruginea0,
            R.drawable.thumb_tundrasnipe_calidris_ferruginea0,
            "'Curlew Sandpiper - Calidris ferruginea - Spóatíta' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "møller sylvia curruca" to listOf(
        BirdImage(
            "Møller (Sylvia curruca)",
            R.drawable.moeller_sylvia_curruca0,
            R.drawable.thumb_moeller_sylvia_curruca0,
            "Martin Mecnarowski via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "knoppsvane cygnus olor" to listOf(
        BirdImage(
            "Knoppsvane (Cygnus olor)",
            R.drawable.knoppsvane_cygnus_olor1,
            R.drawable.thumb_knoppsvane_cygnus_olor1,
            "Paul Boxley via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "gulspurv emberiza citrinella" to listOf(
        BirdImage(
            "Gulspurv (Emberiza citrinella)",
            R.drawable.gulspurv_emberiza_citrinella0,
            R.drawable.thumb_gulspurv_emberiza_citrinella0,
            "'Keltasirkku poimii siemeniä' by Deemu via Flickr, Creative Commons Attribution."
        )
    ),
    "heipiplerke anthus pratensis" to listOf(
        BirdImage(
            "Heipiplerke (Anthus pratensis)",
            R.drawable.heipiplerke_anthus_pratensis0,
            R.drawable.thumb_heipiplerke_anthus_pratensis0,
            "'IMG_0477' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "skjeand anas clypeata" to listOf(
        BirdImage(
            "Skjeand (Anas clypeata)",
            R.drawable.skjeand_anas_clypeata0,
            R.drawable.thumb_skjeand_anas_clypeata0,
            "Dick Daniels via Wikicommons, Creative Commons Attribution ShareAlike."
        )
    ),
    "kaie corvus monedula" to listOf(
        BirdImage(
            "Kaie (Corvus monedula)",
            R.drawable.kaie_corvus_monedula0,
            R.drawable.thumb_kaie_corvus_monedula0,
            "'Beamish Working Museum: Jackdaw (Corvus Monedula)' by Martyn Hutchby via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "lirype lagopus lagopus" to listOf(
        BirdImage(
            "Lirype (Lagopus lagopus)",
            R.drawable.lirype_lagopus_lagopus0,
            R.drawable.thumb_lirype_lagopus_lagopus0,
            "'Male Willow Ptarmigan (Lagopus lagopus)' by Alan Vernon. via Flickr, Creative Commons Attribution."
        )
    ),
    "kattugle strix aluco" to listOf(
        BirdImage(
            "Kattugle (Strix aluco)",
            R.drawable.kattugle_strix_aluco0,
            R.drawable.thumb_kattugle_strix_aluco0,
            "'Tawny Wood Owl 灰林鴞 - IMG_8849' by Wayne Cheng via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "gråtrost turdus pilaris" to listOf(
        BirdImage(
            "Gråtrost (Turdus pilaris)",
            R.drawable.graatrost_turdus_pilaris1,
            R.drawable.thumb_graatrost_turdus_pilaris1,
            "'Fieldfare - Turdus pilaris - Gráþröstur' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "heilo pluvialis apricaria" to listOf(
        BirdImage(
            "Heilo (Pluvialis apricaria)",
            R.drawable.heilo_pluvialis_apricaria0,
            R.drawable.thumb_heilo_pluvialis_apricaria0,
            "'Golden Plover (Heiðlóa)' by Atli Harðarson via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "siland mergus serrator" to listOf(
        BirdImage(
            "Siland (Mergus serrator)",
            R.drawable.siland_mergus_serrator1,
            R.drawable.thumb_siland_mergus_serrator1,
            "'No Pommade Required' by Ingridtaylar via Flickr, Creative Commons Attribution."
        )
    ),
    "gråmåke larus argentatus" to listOf(
        BirdImage(
            "Gråmåke (Larus argentatus)",
            R.drawable.graamaake_larus_argentatus0,
            R.drawable.thumb_graamaake_larus_argentatus0,
            "'IMG_4819' by Gulli H via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "svartspett dryocopus martius" to listOf(
        BirdImage(
            "Svartspett (Dryocopus martius)",
            R.drawable.svartspett_dryocopus_martius0,
            R.drawable.thumb_svartspett_dryocopus_martius0,
            "'Black Woodpecker' by Alastair Rae via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "gjøk cuculus canorus" to listOf(
        BirdImage(
            "Gjøk (Cuculus canorus)",
            R.drawable.gjoek_cuculus_canorus0,
            R.drawable.thumb_gjoek_cuculus_canorus0,
            "'Cuckoo (Cuculus canorus)' by Rainbirder via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "hortulan emberiza hortulana" to listOf(
        BirdImage(
            "Hortulan (Emberiza hortulana)",
            R.drawable.hortulan_emberiza_hortulana0,
            R.drawable.thumb_hortulan_emberiza_hortulana0,
            "'Ortolan Bunting; Emberiza hortulana' by Phenolog via Flickr, Creative Commons Attribution."
        )
    ),
    "kornkråke corvus frugilegus" to listOf(
        BirdImage(
            "Kornkråke (Corvus frugilegus)",
            R.drawable.kornkraake_corvus_frugilegus0,
            R.drawable.thumb_kornkraake_corvus_frugilegus0,
            "'Father and Son' by Foxypar4 via Flickr, Creative Commons Attribution."
        )
    ),
    "havelle clangula hyemalis" to listOf(
        BirdImage(
            "Havelle (Clangula hyemalis)",
            R.drawable.havelle_clangula_hyemalis2,
            R.drawable.thumb_havelle_clangula_hyemalis2,
            "'Long-tailed Duck - Clangula hyemalis - Hávella' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "enkeltbekkasin gallinago gallinago" to listOf(
        BirdImage(
            "Enkeltbekkasin (Gallinago gallinago)",
            R.drawable.enkeltbekkasin_gallinago_gallinago0,
            R.drawable.thumb_enkeltbekkasin_gallinago_gallinago0,
            "'Agachadiza común - Becadell comú - Common snipe - Gallinago gallinago' by Ferran pestaña via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "hubro bubo bubo" to listOf(
        BirdImage(
            "Hubro (Bubo bubo)",
            R.drawable.hubro_bubo_bubo0,
            R.drawable.thumb_hubro_bubo_bubo0,
            "'Uhu (Bubo bubo)' by Arne.list via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "praktærfugl somateria spectabilis" to listOf(
        BirdImage(
            "Praktærfugl (Somateria spectabilis)",
            R.drawable.praktaerfugl_somateria_spectabilis0,
            R.drawable.thumb_praktaerfugl_somateria_spectabilis0,
            "'King Eider - Somateria spectabilis - Æðarkóngur' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "stjertand anas acuta" to listOf(
        BirdImage(
            "Stjertand (Anas acuta)",
            R.drawable.stjertand_anas_acuta0,
            R.drawable.thumb_stjertand_anas_acuta0,
            "'Northern Pintail - Anas acuta - Grafönd' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "polarsisik carduelis hornemanni" to listOf(
        BirdImage(
            "Polarsisik (Carduelis hornemanni)",
            R.drawable.polarsisik_carduelis_hornemanni1,
            R.drawable.thumb_polarsisik_carduelis_hornemanni1,
            "'Hoary Redpoll - Carduelis hornemanni - Hrímtittlingur' by Omarrun via Flickr, Creative Commons Attribution."
        )
    ),
    "nøtteskrike garrulus glandarius" to listOf(
        BirdImage(
            "Nøtteskrike (Garrulus glandarius)",
            R.drawable.noetteskrike_garrulus_glandarius0,
            R.drawable.thumb_noetteskrike_garrulus_glandarius0,
            "'Garrulus glandarius' by Brianfuller6385 via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "fjellrype lagopus muta" to listOf(
        BirdImage(
            "Fjellrype (Lagopus muta)",
            R.drawable.fjellrype_lagopus_muta0,
            R.drawable.thumb_fjellrype_lagopus_muta0,
            "'A male Ptarmigan, Lagopus mutus in The Cairnwell area of Glen Shee. ' by Shandchem via Flickr, Creative Commons Attribution-NoDerivs."
        )
    ),
    "rødstjert phoenicurus phoenicurus" to listOf(
        BirdImage(
            "Rødstjert (Phoenicurus phoenicurus)",
            R.drawable.roedstjert_phoenicurus_phoenicurus0,
            R.drawable.thumb_roedstjert_phoenicurus_phoenicurus0,
            "'Colirrojo Real, Common Redstart, Phoenicurus phoenicurus' by Ferran pestaña via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "ringtrost turdus torquatus" to listOf(
        BirdImage(
            "Ringtrost (Turdus torquatus)",
            R.drawable.ringtrost_turdus_torquatus0,
            R.drawable.thumb_ringtrost_turdus_torquatus0,
            "'Ring ouzel (Turdus torquatus)' by Putneymark via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "stillits carduelis carduelis" to listOf(
        BirdImage(
            "Stillits (Carduelis carduelis)",
            R.drawable.stillits_carduelis_carduelis3,
            R.drawable.thumb_stillits_carduelis_carduelis3,
            "'IMG_3801' by Aigledayres via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "lunde lundefugl fratercula arctica" to listOf(
        BirdImage(
            "Lunde, lundefugl (Fratercula arctica)",
            R.drawable.lunde_lundefugl_fratercula_arctica3,
            R.drawable.thumb_lunde_lundefugl_fratercula_arctica3,
            "'Atlantic Puffin - Fratercula arctica' by Ijbison via Flickr, Creative Commons Attribution."
        )
    ),
    "krikkand anas crecca" to listOf(
        BirdImage(
            "Krikkand (Anas crecca)",
            R.drawable.krikkand_anas_crecca0,
            R.drawable.thumb_krikkand_anas_crecca0,
            "'Xarxet comú - Cerceta común - Common teal - Anas crecca' by Ferran pestaña via Flickr, Creative Commons Attribution ShareAlike."
        )
    ),
    "gulirisk serinus serinus" to listOf(
        BirdImage(
            "Gulirisk (Serinus serinus)",
            R.drawable.gulirisk_serinus_serinus0,
            R.drawable.thumb_gulirisk_serinus_serinus0,
            "'Verdecillo cantante - gafarró cantant - european serin - serinus serinus' by Ferran pestaÃ±a via Flickr, Creative Commons Attribution ShareAlike."
        )
    )
)
