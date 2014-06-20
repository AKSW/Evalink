package org.aksw;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.RDFNode;

public class ReaderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReadModel() {
		Model model = Reader.readModel("dataModels/task1.nt");
		Set<RDFNode> o = model.listObjectsOfProperty(model.createResource("http://dbpedia.org/resource/Hanam"), model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")).toSet();
		assertTrue(o.iterator().next().toString().equals("http://dbpedia.org/class/yago/PopulatedPlacesInSouthKorea"));
	}

}
